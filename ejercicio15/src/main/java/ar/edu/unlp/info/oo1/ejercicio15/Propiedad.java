package ar.edu.unlp.info.oo1.ejercicio15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	
	private String nombre;
	private String descripcion;
	private double precioPorNoche;
	private String direccion;
	private List<Reserva> reservas;
	
	public Propiedad(String nombre, String descripcion, double precioPorNoche, String direccion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioPorNoche = precioPorNoche;
		this.direccion = direccion;
		this.reservas = new ArrayList<Reserva>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	public Reserva crearReserva(Propiedad propiedad, DateLapse periodo, Usuario inquilino) {
		Reserva reserva = new Reserva(periodo, propiedad,inquilino);
		this.reservas.add(reserva);
		return reserva;
	}
	
	public double calcularIngresoPropiedad(DateLapse periodo) {
		return this.reservas.stream().filter(r -> r.getPeriodo().overlaps(periodo))
							.mapToDouble(r -> r.calcularPrecioReserva())
							.sum();
				
	}
	
	public boolean propiedadDisponible(DateLapse periodo) {
		return this.reservas.stream().noneMatch(r -> r.getPeriodo().overlaps(periodo));
	}
	
	public void eliminarReserva(Reserva reserva) {
		if (reserva.getPeriodo().getFrom().isAfter(LocalDate.now()))
			this.reservas.remove(reserva);
	}
	
	
	
}

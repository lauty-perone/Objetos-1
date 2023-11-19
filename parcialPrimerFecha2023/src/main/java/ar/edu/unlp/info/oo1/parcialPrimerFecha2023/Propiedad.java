package ar.edu.unlp.info.oo1.parcialPrimerFecha2023;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	
	private double precioPorNoche;
	private String nombre;
	private String ubicacion;
	private List<Reserva> reservas;
	private List<Regla> reglas;
	
	public Propiedad(double precioPorNoche, String nombre, String ubicacion) {
		this.precioPorNoche = precioPorNoche;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.reservas = new ArrayList<Reserva>();
		this.reglas = new ArrayList<Regla>();
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public List<Regla> getReglas() {
		return reglas;
	}

	public void setReglas(List<Regla> reglas) {
		this.reglas = reglas;
	}

	public Reserva crearReserva(Usuario inquilino, DateLapse dateLapse, double precioFinal) {
		
		Reserva reserva = new Reserva(inquilino,dateLapse,precioFinal);
		this.reservas.add(reserva);
		return reserva;
	}
	
	public double calcularPrecioBase(DateLapse fecha) {
		return fecha.sizeInDays() * this.precioPorNoche;
	}
	
	public boolean estaDisponible (DateLapse fecha) {
		return this.reservas.stream()
							.noneMatch(r -> !r.estaOcupada(fecha));
	}
	
	public ReglaEstanciaProlongada agregarRegla(int porcentaje, int cantMinimaDias) {
		if (this.reglas.stream().noneMatch(r -> r.esUnica())){
			ReglaEstanciaProlongada regla =  new ReglaEstanciaProlongada(porcentaje, cantMinimaDias);
			this.reglas.add(regla);
			return regla;
		}
		return null;
	}
	
	public ReglaRangoFechas agregarRegla(int porcentaje, DateLapse rango, boolean esAumento) {
		ReglaRangoFechas regla = new ReglaRangoFechas(porcentaje,rango,esAumento);
		this.reglas.add(regla);
		return regla;
	}
	
	
}

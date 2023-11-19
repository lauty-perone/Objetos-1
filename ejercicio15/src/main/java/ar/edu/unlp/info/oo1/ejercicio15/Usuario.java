package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
	
	private String nombre;
	private String direccion;
	private int dni;
	private List<Propiedad> propiedades;
	
	public Usuario(String nombre, String direccion, int dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.propiedades = new ArrayList<Propiedad>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public double calcularIngreso(DateLapse periodo) {
		return this.propiedades.stream().mapToDouble(p -> p.calcularIngresoPropiedad(periodo)).sum();
	}
	
	public List<Reserva> devolverReservas(){
		return this.propiedades.stream()
				.flatMap(p -> p.getReservas().stream()
				.filter(r -> r.getInquilino().getDni() == this.dni))
				.collect(Collectors.toList());
	}
}

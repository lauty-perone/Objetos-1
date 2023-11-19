package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Persona{
	
	private String nombre;
	private String direccion;
	private List<Llamada> llamadas;
	
	public Persona(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.llamadas = new ArrayList<Llamada>();
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

	public List<Llamada> getLlamadas() {
		return llamadas;
	}

	public void setLlamadas(List<Llamada> llamadas) {
		this.llamadas = llamadas;
	}
	
	public Local registrarLocal(Local local) {
		this.llamadas.add(local);
		return local;
	}
	
	public Interurbana registrarInterurbana(Interurbana interurbana) {
		this.llamadas.add(interurbana);
		return interurbana;
	}
	
	public Internacional registrarInternacional (Internacional internacional) {
		 this.llamadas.add(internacional);
		 return internacional;
	}
	
	public abstract Factura facturarLlamadas(LocalDateTime inicio, LocalDateTime fin);
	
	public double calcularLlamadas(LocalDateTime inicio, LocalDateTime fin) {
		return this.llamadas.stream()
							.filter(llamada -> llamada.getFechaYHoraComienzo().isAfter(inicio)&&
												llamada.getFechaYHoraComienzo().isBefore(fin))
							.mapToDouble(llamada -> llamada.calcularCosto())
							.sum();
	}
}

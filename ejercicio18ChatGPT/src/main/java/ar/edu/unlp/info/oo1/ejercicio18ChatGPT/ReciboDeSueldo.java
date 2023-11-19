package ar.edu.unlp.info.oo1.ejercicio18ChatGPT;

import java.time.LocalDate;

public class ReciboDeSueldo {
	
	private String nombre;
	private String apellido;
	private String cuil;
	private int antiguedad;
	private LocalDate fecha;
	private double montoTotal;
	
	public ReciboDeSueldo(String nombre, String apellido, String cuil, int antiguedad, LocalDate fecha,
			double montoTotal) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.antiguedad = antiguedad;
		this.fecha = fecha;
		this.montoTotal = montoTotal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	
	
	
	
}

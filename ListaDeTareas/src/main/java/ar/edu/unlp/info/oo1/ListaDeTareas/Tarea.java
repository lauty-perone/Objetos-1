package ar.edu.unlp.info.oo1.ListaDeTareas;

import java.time.LocalDate;

public abstract class Tarea {
	
	private String titulo;
	private String descripcion;
	private boolean completa;
	private LocalDate fechaVencimiento;
	private String etiqueta;
	
	public Tarea(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.completa = false;
		this.fechaVencimiento = null;
		this.etiqueta = null;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isCompleta() {
		return completa;
	}

	public void setCompleta(boolean completa) {
		this.completa = completa;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getEtiqueta() {
		return etiqueta;
	}
	
	public void marcarTareaCompleta() {
		this.completa = true;
	}
	
	public void agregarEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
}

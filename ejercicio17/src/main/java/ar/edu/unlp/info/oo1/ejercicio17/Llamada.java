package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDateTime;

public abstract class Llamada {
	
	private LocalDateTime fechaYHoraComienzo;
	private int duracion;
	
	public Llamada(LocalDateTime fechaYHoraComienzo, int duracion) {
		this.fechaYHoraComienzo = fechaYHoraComienzo;
		this.duracion = duracion;
	}

	public LocalDateTime getFechaYHoraComienzo() {
		return fechaYHoraComienzo;
	}

	public void setFechaYHoraComienzo(LocalDateTime fechaYHoraComienzo) {
		this.fechaYHoraComienzo = fechaYHoraComienzo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public abstract double calcularCosto();
	
}

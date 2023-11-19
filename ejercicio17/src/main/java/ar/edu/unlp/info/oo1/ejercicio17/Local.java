package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDateTime;

public class Local extends Llamada {

	public Local(LocalDateTime fechaYHoraComienzo, int duracion) {
		super(fechaYHoraComienzo, duracion);
	}

	@Override
	public double calcularCosto() {
		return super.getDuracion();
	}
	
	
	
	
	
}

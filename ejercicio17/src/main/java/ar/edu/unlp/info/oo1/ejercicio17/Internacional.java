package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDateTime;

public class Internacional extends Llamada {
	
	private String paisOrigen;
	private String paisDestino;
	
	public Internacional(LocalDateTime fechaYHoraComienzo, 
						int duracion, String paisOrigen, 
						String paisDestino) {
		super(fechaYHoraComienzo, duracion);
		this.paisOrigen = paisOrigen;
		this.paisDestino = paisDestino;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getPaisDestino() {
		return paisDestino;
	}

	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}

	@Override
	public double calcularCosto() {
		if (super.getFechaYHoraComienzo().getHour() >= 20 && super.getFechaYHoraComienzo().getHour() <= 8)
			return 4 * super.getDuracion();
		return 3 * super.getDuracion();
	}
	
	
	
	
}

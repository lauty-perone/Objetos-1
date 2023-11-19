package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDateTime;

public class Interurbana extends Llamada{
	
	private int distancia;

	public Interurbana(LocalDateTime fechaYHoraComienzo, int duracion, int distancia) {
		super(fechaYHoraComienzo, duracion);
		this.distancia = distancia;
	}

	public int getDistancia() {
		return distancia;
	}
	
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	@Override
	public double calcularCosto() {
		if (this.distancia < 100)
			return 5+(super.getDuracion() * 2);
		else
			if(this.distancia >= 100 && this.distancia <= 500)
				return 5+ (super.getDuracion() * 2.5);
		return 5+(super.getDuracion() * 3);
	}
	
	
	
	
}

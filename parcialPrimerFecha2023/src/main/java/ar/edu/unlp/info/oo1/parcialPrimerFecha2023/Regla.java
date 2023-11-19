package ar.edu.unlp.info.oo1.parcialPrimerFecha2023;

public abstract class Regla {
	
	private int porcentaje;

	public Regla(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public boolean esUnica() {
		return false;
	}
	
	public abstract double aplicarRegla(DateLapse fecha, double precioFinal, double precioNocheReal);
	public abstract int prioridad();
	
	
}

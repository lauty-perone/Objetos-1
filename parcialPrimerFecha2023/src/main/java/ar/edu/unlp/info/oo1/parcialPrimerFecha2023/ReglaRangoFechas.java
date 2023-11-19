package ar.edu.unlp.info.oo1.parcialPrimerFecha2023;

public class ReglaRangoFechas extends Regla{
	
	private DateLapse rango;
	private boolean esAumento;
	
	public ReglaRangoFechas(int porcentaje, DateLapse rango, boolean esAumento) {
		super(porcentaje);
		this.rango = rango;
		this.esAumento = esAumento;
	}

	public DateLapse getRango() {
		return rango;
	}

	public void setRango(DateLapse rango) {
		this.rango = rango;
	}

	public boolean isEsAumento() {
		return esAumento;
	}

	public void setEsAumento(boolean esAumento) {
		this.esAumento = esAumento;
	}
	
	public int prioridad() {
		return 1;
	}
	
	public double aplicarRegla(DateLapse fecha, double precioTotal, double precioNocheReal) {
		int diasQueAplicar = rango.daysThatOverlaps(fecha);
		
		double porcentaje = super.getPorcentaje()/100.0; 
		if (this.esAumento) {
			porcentaje = porcentaje + 1;
		} else {
			porcentaje = 1 - porcentaje;
		}
		
		double precioPrevio = precioTotal - (diasQueAplicar * precioNocheReal);
		return precioPrevio + (diasQueAplicar * (precioNocheReal * super.getPorcentaje()));
	}
	
	
}

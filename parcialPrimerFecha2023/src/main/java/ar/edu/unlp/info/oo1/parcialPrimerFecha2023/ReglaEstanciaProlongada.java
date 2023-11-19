package ar.edu.unlp.info.oo1.parcialPrimerFecha2023;

public class ReglaEstanciaProlongada extends Regla{
	
	private int cantidadMinimaDias;

	public ReglaEstanciaProlongada(int porcentaje, int cantidadMinimaDias) {
		super(porcentaje);
		this.cantidadMinimaDias = cantidadMinimaDias;
	}

	public int getCantidadMinimaDias() {
		return cantidadMinimaDias;
	}

	public void setCantidadMinimaDias(int cantidadMinimaDias) {
		this.cantidadMinimaDias = cantidadMinimaDias;
	}
	
	public int prioridad() {
		return 2;
	}
	
	public boolean esUnica() {
		return true;
	}
	
	public double aplicarRegla(DateLapse fecha, double precioTotal, double precioNocheTotal) {
		if (fecha.sizeInDays() > this.cantidadMinimaDias)
			return precioTotal - precioTotal * super.getPorcentaje()/ 100;
		return precioTotal;
	}
}

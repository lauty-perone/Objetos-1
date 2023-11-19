package ar.edu.unlp.info.oo1.ParcialPrimer2023;

import java.time.LocalDate;

public class EstanciaProlongada extends Regla{
	
	private int cantMinimaDias;

	public EstanciaProlongada(int porcentaje, int cantMinimaDias) {
		super(porcentaje);
		this.cantMinimaDias = cantMinimaDias;
	}
	
	public int prioridad() {
		return 2;
	}
	
	public boolean esUnica() {
		return true;
	}
	public double aplicarRegla(double precioNoche, LocalDate from, LocalDate to,double precioTotal) {
		DateLapse rango= new DateLapse(from, to);
		if (rango.sizeInDays()> this.cantMinimaDias)
			return precioTotal - (precioNoche * rango.sizeInDays()*super.getPorcentaje());
		return precioTotal;
	}
}

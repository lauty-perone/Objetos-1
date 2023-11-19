package ar.edu.unlp.info.oo1.ParcialSegundoRecup2022;

public class Limpieza extends Servicio{
	
	private double tarifaMinima;

	public Limpieza(double precioHora, int cantHoras, double tarifaMinima) {
		super(precioHora, cantHoras);
		this.tarifaMinima = tarifaMinima;
	}

	public double getTarifaMinima() {
		return tarifaMinima;
	}

	public void setTarifaMinima(double tarifaMinima) {
		this.tarifaMinima = tarifaMinima;
	}
	
	public double calcularMontoAbonar() {
		double monto = super.monto();
		if (monto > this.tarifaMinima)
			return monto;
		return this.tarifaMinima;
	}
}

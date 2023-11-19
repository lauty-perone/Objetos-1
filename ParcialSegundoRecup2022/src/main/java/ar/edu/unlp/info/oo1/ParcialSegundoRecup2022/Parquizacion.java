package ar.edu.unlp.info.oo1.ParcialSegundoRecup2022;

public class Parquizacion extends Servicio{
	
	private int cantMaquinas;
	private double costoMantenimiento;
	
	public Parquizacion(double precioHora, int cantHoras, int cantMaquinas, double costoMantenimiento) {
		super(precioHora, cantHoras);
		this.cantMaquinas = cantMaquinas;
		this.costoMantenimiento = costoMantenimiento;
	}

	public int getCantMaquinas() {
		return cantMaquinas;
	}

	public void setCantMaquinas(int cantMaquinas) {
		this.cantMaquinas = cantMaquinas;
	}

	public double getCostoMantenimiento() {
		return costoMantenimiento;
	}

	public void setCostoMantenimiento(double costoMantenimiento) {
		this.costoMantenimiento = costoMantenimiento;
	}
	
	public double calcularMontoAbonar() {
		return super.monto() + this.cantMaquinas * this.costoMantenimiento;
	}
}

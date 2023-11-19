package ar.edu.unlp.info.oo1.parcialPrimerFecha2023;

public class Reserva {
	
	private Usuario inquilino;
	private DateLapse dateLapse;
	private double precioFinal;
	
	public Reserva(Usuario inquilino,DateLapse dateLapse, double precioFinal) {
		this.dateLapse = dateLapse;
		this.precioFinal = precioFinal;
	}

	public DateLapse getDateLapse() {
		return dateLapse;
	}

	public void setDateLapse(DateLapse dateLapse) {
		this.dateLapse = dateLapse;
	}

	public double getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}

	public Usuario getInquilino() {
		return inquilino;
	}

	public void setInquilino(Usuario inquilino) {
		this.inquilino = inquilino;
	}
	
	public boolean estaOcupada(DateLapse dateLapse) {
		return this.dateLapse.overlaps(dateLapse);
	}
}

package ar.edu.unlp.info.oo1.ejercicio15;

public class Reserva {

	private DateLapse periodo;
	private Propiedad propiedad;
	private Usuario inquilino;
	
	public Reserva(DateLapse periodo, Propiedad propiedad, Usuario inquilino) {
		this.periodo = periodo;
		this.propiedad = propiedad;
		this.inquilino = inquilino;
	}

	public DateLapse getPeriodo() {
		return periodo;
	}

	public void setPeriodo(DateLapse periodo) {
		this.periodo = periodo;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}
	
	public Usuario getInquilino() {
		return inquilino;
	}

	public void setInquilino(Usuario inquilino) {
		this.inquilino = inquilino;
	}

	public double calcularPrecioReserva() {
		return this.periodo.sizeInDays() * this.propiedad.getPrecioPorNoche();
	}
	
	
}

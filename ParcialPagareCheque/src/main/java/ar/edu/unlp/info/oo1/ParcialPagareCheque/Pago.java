package ar.edu.unlp.info.oo1.ParcialPagareCheque;

import java.time.LocalDate;

public abstract class Pago {

	private boolean vencido;
	private double monto;
	private String destinatario;
	private String originante;
	private LocalDate fechaEmision;
	
	public Pago(Boolean vencido, double monto, String destinatario, String originante, LocalDate fechaEmision) {
		this.vencido = vencido;
		this.monto = monto;
		this.destinatario = destinatario;
		this.originante = originante;
		this.fechaEmision = fechaEmision;
	}

	public Boolean getVencido() {
		return vencido;
	}

	public void setVencido(Boolean vencido) {
		this.vencido = vencido;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getOriginante() {
		return originante;
	}

	public void setOriginante(String originante) {
		this.originante = originante;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	
	public abstract boolean estaVencido();
	
	
}

package ar.edu.unlp.info.oo1.ParcialPagareCheque;

import java.time.LocalDate;

public class Pagare extends Pago{
	
	private LocalDate fechaVencimiento;

	public Pagare(Boolean vencido, double monto, String destinatario, String originante, LocalDate fechaEmision,
			LocalDate fechaVencimiento) {
		super(vencido, monto, destinatario, originante, fechaEmision);
		this.fechaVencimiento = fechaVencimiento;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public boolean estaVencido() {
		return LocalDate.now().isAfter(getFechaVencimiento());
	}
	
	
	
	
	
}

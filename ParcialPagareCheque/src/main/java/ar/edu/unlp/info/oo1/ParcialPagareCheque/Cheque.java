package ar.edu.unlp.info.oo1.ParcialPagareCheque;

import java.time.LocalDate;

public class Cheque extends Pago{

	public Cheque(Boolean vencido, double monto, String destinatario, String originante, LocalDate fechaEmision) {
		super(vencido, monto, destinatario, originante, fechaEmision);
		// TODO Auto-generated constructor stub
	}
	
	public boolean estaVencido() {
		return LocalDate.now().isAfter(getFechaEmision().plusDays(30));
	}
}

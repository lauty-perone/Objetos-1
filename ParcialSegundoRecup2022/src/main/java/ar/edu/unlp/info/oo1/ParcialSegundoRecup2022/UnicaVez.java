package ar.edu.unlp.info.oo1.ParcialSegundoRecup2022;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class UnicaVez implements Contrato{
	
	private Servicio servicio;
	private LocalDate from;

	public UnicaVez(Servicio servicio,LocalDate from) {
		this.servicio = servicio;
		this.from = from;
	}
	
	private boolean finDeSemana() {
		if (from.equals(DayOfWeek.SATURDAY)|| (from.equals(DayOfWeek.SUNDAY)))
			return true;
		return false;
	}
	public double montoAPagar() {
		if (this.finDeSemana())
			return this.servicio.calcularMontoAbonar() * 0.85;
		return this.servicio.calcularMontoAbonar();
	}
	
}

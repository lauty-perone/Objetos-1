package ar.edu.unlp.info.oo1.ejercicio15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse{
	
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}

	public DateLapse() {
	
	}

	public LocalDate getFrom() {
		return from;
	}

	public LocalDate getTo() {
		return to;
	}
	
	//retorna la cantidad de dias entre dos fechas
	public int sizeInDays() {
		return 	(int) ChronoUnit.DAYS.between(from, to);
	}
	
	//retorna true o false si la fecha other se encuentra entre dos fechas 
	public boolean includesDate(LocalDate other) {
		return other.isAfter(from) && other.isBefore(to);
	}
	
	/** retorna true si el periodo de tiempo del receptor se superpone
	 * con el recibido por parametro
	 */
	public boolean overlaps( DateLapse anotherDateLapse) {
		return anotherDateLapse.includesDate(this.getFrom()) || anotherDateLapse.includesDate(getTo())
				|| anotherDateLapse.equalsFrom(this.getFrom()) || anotherDateLapse.equalsTo(this.getTo());
	}
	
	public boolean equalsTo(LocalDate date) {
		return this.getTo().equals(date);
	}
	
	public boolean equalsFrom(LocalDate date) {
		return this.getFrom().equals(date);
	}
	
}

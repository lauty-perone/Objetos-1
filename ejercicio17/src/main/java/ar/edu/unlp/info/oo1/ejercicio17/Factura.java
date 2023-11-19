package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDateTime;

public class Factura {
	
	private LocalDateTime fecha;
	private LocalDateTime inicioPeriodo;
	private LocalDateTime finPeriodo;
	private double montoTotal;
	
	public Factura(LocalDateTime fecha, LocalDateTime inicio, LocalDateTime fin, double montoTotal) {
		this.fecha = fecha;
		this.inicioPeriodo = inicio;
		this.finPeriodo = fin;
		this.montoTotal = montoTotal;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public LocalDateTime getInicioPeriodo() {
		return inicioPeriodo;
	}

	public void setInicioPeriodo(LocalDateTime inicioPeriodo) {
		this.inicioPeriodo = inicioPeriodo;
	}

	public LocalDateTime getFinPeriodo() {
		return finPeriodo;
	}

	public void setFinPeriodo(LocalDateTime finPeriodo) {
		this.finPeriodo = finPeriodo;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	
	
	
	
}

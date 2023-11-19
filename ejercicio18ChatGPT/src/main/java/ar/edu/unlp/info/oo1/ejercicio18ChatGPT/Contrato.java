package ar.edu.unlp.info.oo1.ejercicio18ChatGPT;

import java.time.LocalDate;

public abstract class Contrato {
	
	private LocalDate fechaInicio;
	private Empleado empleado;

	public Contrato(LocalDate fechaInicio, Empleado empleado) {
		this.fechaInicio = fechaInicio;
		this.empleado = empleado;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	private int calcularAntiguedad() {
		return LocalDate.now().getYear() - this.empleado.getFechaInicioLaboral().getYear();
	}
	
	private double montoAntiguo() {
		int anti = this.calcularAntiguedad();
		if (anti <= 5)
			return this.calcularMonto() * 0.3;
		if (anti <= 10)
			return this.calcularMonto() * 0.5;
		if (anti <= 15)
			return this.calcularMonto() * 0.7;
		return this.calcularMonto();
	}
	
	public ReciboDeSueldo crearReciboDeSueldo() {
		return new ReciboDeSueldo(this.empleado.getNombre(),this.empleado.getApellido(),
								  this.empleado.getCuil(),this.calcularAntiguedad(),LocalDate.now(),
								  this.montoAntiguo() + this.calcularMonto());
	}
	
	public abstract double calcularMonto();
	public abstract boolean estaVencido();
	
	
	
}

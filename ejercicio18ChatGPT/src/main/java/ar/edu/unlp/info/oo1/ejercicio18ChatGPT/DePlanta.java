package ar.edu.unlp.info.oo1.ejercicio18ChatGPT;

import java.time.LocalDate;

public class DePlanta extends Contrato {
	
	private double sueldoMensual;
	private double montoConyuge;
	private double montoHijos;
	
	public DePlanta(LocalDate fechaInicio,Empleado empleado, double sueldoMensual, double montoConyuge, double montoHijos) {
		super(fechaInicio,empleado);
		this.sueldoMensual = sueldoMensual;
		this.montoConyuge = montoConyuge;
		this.montoHijos = montoHijos;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	public double getMontoConyuge() {
		return montoConyuge;
	}

	public void setMontoConyuge(double montoConyuge) {
		this.montoConyuge = montoConyuge;
	}

	public double getMontoHijos() {
		return montoHijos;
	}

	public void setMontoHijos(double montoHijos) {
		this.montoHijos = montoHijos;
	}
	
	public double calcularMonto() {
		double monto=0;
		if (super.getEmpleado().isSiTieneConyuge())
			monto += this.montoConyuge;
		if (super.getEmpleado().isSiTieneHijos())
			monto += this.montoHijos;
		return monto += this.sueldoMensual;
	}
	
	public boolean estaVencido() {
		return false; //Nunca se vencen
	}
}

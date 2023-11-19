package ar.edu.unlp.info.oo1.ejercicio18ChatGPT;

import java.time.LocalDate;

public class PorHoras extends Contrato{
	
	private double valorHora;
	private int numHoras;
	private LocalDate fechaFin;
	
	public PorHoras(LocalDate fechaInicio,Empleado empleado, double valorHora, int numHoras,LocalDate fechaFin) {
		super(fechaInicio,empleado);
		this.valorHora = valorHora;
		this.numHoras = numHoras;
		this.fechaFin = fechaFin;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}
	
	public double calcularMonto() {
		return this.valorHora * this.numHoras;
	}
	
	public boolean estaVencido() {
		return this.fechaFin.isAfter(LocalDate.now());
	}
	
	
}

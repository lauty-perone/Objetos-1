package ar.edu.unlp.info.oo1.ParcialSegundoRecup2022;

import java.time.LocalDate;

public class Prolongado implements Contrato {
	
	private int cantDias;
	private Servicio servicio;
	private LocalDate fecha;
	
	public Prolongado(int cantDias, Servicio servicio,LocalDate fecha) {
		this.cantDias = cantDias;
		this.servicio = servicio;
		this.fecha = fecha;
	}

	public int getCantDias() {
		return cantDias;
	}

	public void setCantDias(int cantDias) {
		this.cantDias = cantDias;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double montoAPagar() {
		double monto = servicio.calcularMontoAbonar() * this.cantDias;
		if (this.cantDias > 5)
			return monto * 0.9;
		return monto;
	}
	
	
}

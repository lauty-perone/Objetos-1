package ar.edu.unlp.info.oo1.ejercicio18ChatGPT;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
	
	private String nombre;
	private String apellido;
	private String cuil;
	private LocalDate fechaNacimiento;
	private boolean siTieneConyuge;
	private boolean siTieneHijos;
	private LocalDate fechaInicioLaboral;
	private List<Contrato> contratos;
	
	public Empleado(String nombre, String apellido, String cuil, LocalDate fechaNacimiento, boolean siTieneConyuge,
			boolean siTieneHijos) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.fechaNacimiento = fechaNacimiento;
		this.siTieneConyuge = siTieneConyuge;
		this.siTieneHijos = siTieneHijos;
		this.fechaInicioLaboral = LocalDate.now();
		this.contratos = new ArrayList<Contrato>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean isSiTieneConyuge() {
		return siTieneConyuge;
	}

	public void setSiTieneConyuge(boolean siTieneConyuge) {
		this.siTieneConyuge = siTieneConyuge;
	}

	public boolean isSiTieneHijos() {
		return siTieneHijos;
	}

	public void setSiTieneHijos(boolean siTieneHijos) {
		this.siTieneHijos = siTieneHijos;
	}

	public LocalDate getFechaInicioLaboral() {
		return fechaInicioLaboral;
	}

	public void setFechaInicioLaboral(LocalDate fechaInicioLaboral) {
		this.fechaInicioLaboral = fechaInicioLaboral;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}
	
	public void agregarContratoPorHoras(PorHoras porHoras) {
		this.contratos.add(porHoras);
	}
	
	public void agregarContratoDePlanta(DePlanta dePlanta) {
		this.contratos.add(dePlanta);
	}
	
	public boolean devolverContratoActualVencido(){
		return this.contratos.stream()
				.filter(contrato -> contrato.getFechaInicio().isAfter(LocalDate.now()))
				.findFirst().orElse(null)
				.estaVencido();
	}
	
}

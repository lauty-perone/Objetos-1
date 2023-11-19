package ar.edu.unlp.info.oo1.ParcialSegundoRecup2022;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nombre;
	private String direccion;
	private List<Contrato> contratos;
	
	public Cliente(String nombre, String direccion) {
			this.nombre = nombre;
			this.direccion = direccion;
			this.contratos = new ArrayList<Contrato>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}
	
	public UnicaVez agregarContratoUnico(Servicio servicio,LocalDate fecha) {
		UnicaVez unico = new UnicaVez(servicio, fecha);
		this.contratos.add(unico);
		return unico;
	}
	
	public Prolongado agregarContratoProlongado(int cantDias, Servicio servicio,LocalDate fecha) {
		Prolongado prolongado = new Prolongado(cantDias, servicio, fecha);
		this.contratos.add(prolongado);
		return prolongado;
	}
	
	public double montoAPagar() {
		return this.contratos.stream().mapToDouble(c -> c.montoAPagar()).sum();
	}
	
}

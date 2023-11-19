package ar.edu.unlp.info.oo1.ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class Telefono {
	
	private int numero;
	private boolean disponible;
	private List<Persona> clientes;
	
	public Telefono(int numero, boolean disponible) {
		this.numero = numero;
		this.disponible = disponible;
		this.clientes =  new ArrayList<Persona>();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	public List<Persona> getClientes() {
		return clientes;
	}

	public void setClientes(List<Persona> clientes) {
		this.clientes = clientes;
	}

	public Fisica agregarFisica(Fisica fisica) {
		this.clientes.add(fisica);
		return fisica;
	}
	
	public Juridica agregarJuridica(Juridica juridica) {
		this.clientes.add(juridica);
		return juridica;
	}
	
	
}

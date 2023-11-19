package ar.edu.unlp.info.oo1.ParcialPrimer2023;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private int dni;
	private List<Propiedad> propiedades;
	
	public Usuario(int dni) {
		this.dni = dni;
		this.propiedades = new ArrayList<Propiedad>();
	}
	
	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public List<Propiedad> getPropiedades() {
		return propiedades;
	}


	public void setPropiedades(List<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}


	public Propiedad agregarPropiedad(double precioNoche, String nombre, String direccion) {
		//se puede chequear si existe o no
		Propiedad p = new Propiedad(precioNoche, nombre, direccion);
		this.propiedades.add(p);
		return p;
	}
}

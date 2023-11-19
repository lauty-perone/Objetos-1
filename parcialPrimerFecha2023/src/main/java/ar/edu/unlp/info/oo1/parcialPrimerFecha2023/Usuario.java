package ar.edu.unlp.info.oo1.parcialPrimerFecha2023;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String dni;
	private List<Propiedad> propiedades;

	public Usuario(String dni) {
		this.dni = dni;
		this.propiedades = new ArrayList<Propiedad>();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Propiedad registrarPropiedad(double precioPorNoche, String nombre, String ubicacion) {
		Propiedad propiedad = new Propiedad (precioPorNoche, nombre,ubicacion);
		this.propiedades.add(propiedad);
		return propiedad;		
	}
}

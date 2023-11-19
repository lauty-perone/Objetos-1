package ar.edu.unlp.info.oo1.ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	private List<Telefono> telefonos;

	public Sistema() {
		this.telefonos = new ArrayList<Telefono>();
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	
	public void agregarTelefono(Telefono telefono) {
		this.telefonos.add(telefono);
	}
}

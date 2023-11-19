package ar.edu.unlp.info.oo1.parcialPrimerFecha2023;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	private List<Usuario> usuarios;
	
	public Sistema() {
		this.usuarios =  new ArrayList<Usuario>();
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public Usuario crearUsuario(String dni) {
		Usuario usuario = new Usuario(dni);
		this.usuarios.add(usuario);
		return usuario;
	}
}

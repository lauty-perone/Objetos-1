package ar.edu.unlp.info.oo1.ParcialPrimer2023;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	private List<Usuario> usuarios;
	
	public Sistema() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario registrarUsuario(int dni) {
		Usuario user = new Usuario(dni);
		this.usuarios.add(user);
		return user;
	}
}

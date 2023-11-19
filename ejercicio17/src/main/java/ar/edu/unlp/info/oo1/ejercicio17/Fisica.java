package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDateTime;

public class Fisica extends Persona {
	
	private int dni;

	public Fisica(String nombre, String direccion, int dni) {
		super(nombre, direccion);
		this.dni = dni;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public Local registrarLocal(Local local) {
		return super.registrarLocal(local);
	}
	
	public Interurbana registrarInterurbana(Interurbana interurbana) {
		return super.registrarInterurbana(interurbana);
	}
	
	public Internacional registrarInternacional(Internacional internacional) {
		return super.registrarInternacional(internacional);
	}

	@Override
	public Factura facturarLlamadas(LocalDateTime inicio, LocalDateTime fin) {
		return new Factura(LocalDateTime.now(), inicio, fin,super.calcularLlamadas(inicio, fin));
	}

	
	
	
	
	
	
}

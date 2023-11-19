package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDateTime;

public class Juridica extends Persona{
	
	private int CUIT;
	private String tipo;
	
	public Juridica(String nombre, String direccion, int cUIT, String tipo) {
		super(nombre, direccion);
		CUIT = cUIT;
		this.tipo = tipo;
	}

	public int getCUIT() {
		return CUIT;
	}

	public void setCUIT(int cUIT) {
		CUIT = cUIT;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return new Factura(LocalDateTime.now(), inicio, fin, super.calcularLlamadas(inicio, fin)* 0.9);
	}

	
	
	
	
	
}

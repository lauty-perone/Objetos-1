package ar.edu.unlp.info.oo1.ParcialSegundoRecup2022;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	private List<Cliente> clientes;
	private List<Servicio> servicios;
	
	public Sistema() {
		this.clientes = new ArrayList<Cliente>();
		this.servicios = new ArrayList<Servicio>();
	}
	
	public Cliente agregarCliente(String nombre, String direccion) {
		Cliente cliente = new Cliente(nombre, direccion);
		if (this.clientes.contains(cliente))
			return null;
		this.clientes.add(cliente);
		return cliente;
	}
	
	public Limpieza agregarServicioLimpieza(double precioHora, int cantHoras,double tarifaMinima) {
		Limpieza l = new Limpieza(precioHora, cantHoras, tarifaMinima);
		this.servicios.add(l);
		return l;
	}
	
	public Parquizacion agregarServicioParquizacion(double precioHora, int cantHoras, int cantMaquinas
										,double costoMantenimiento) {
		Parquizacion p = new Parquizacion(precioHora, cantHoras, cantMaquinas, costoMantenimiento);
		this.servicios.add(p);
		return p;
	}
	
	public int cantServiciosConMontoMayor(double monto) {
		return (int) this.servicios.stream().filter(s -> s.calcularMontoAbonar()> monto).count();
	}
}

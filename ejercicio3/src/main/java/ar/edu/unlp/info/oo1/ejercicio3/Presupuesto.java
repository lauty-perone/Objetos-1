package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto {

	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items;
	
	public Presupuesto(LocalDate fecha, String cliente) {
		this.fecha = fecha;
		this.cliente = cliente;
		this.items =  new ArrayList<Item>();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	public double calcularTotal() {
		return this.items.stream()
						 .mapToDouble(item -> item.costo())
						 .sum();
	}
	
	
	
}

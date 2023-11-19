package ar.edu.unlp.info.oo1.ListaDeTareas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Proyecto {
	
	private String titulo;
	private String descripcion;
	private List<ListaDeTareas> listaDeTareas;
	
	public Proyecto(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.listaDeTareas = new ArrayList<ListaDeTareas>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<ListaDeTareas> getListaDeTareas() {
		return listaDeTareas;
	}

	public void setListaDeTareas(List<ListaDeTareas> listaDeTareas) {
		this.listaDeTareas = listaDeTareas;
	}
	
	public void agregarListaDeTareas(ListaDeTareas listaDeTareas) {
		this.listaDeTareas.add(listaDeTareas);
	}
	
	public List<List<Tarea>> tareasDelProyecto(){
		return this.listaDeTareas.stream().map(lista -> lista.getTareas())
				.collect(Collectors.toList());
	}
	
	
}

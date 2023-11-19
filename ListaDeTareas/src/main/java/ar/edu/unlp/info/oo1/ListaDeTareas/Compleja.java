package ar.edu.unlp.info.oo1.ListaDeTareas;

import java.util.ArrayList;
import java.util.List;

public class Compleja extends Tarea{
	
	private String material;
	private List<Tarea> dependencias;

	public Compleja(String titulo, String descripcion, String material) {
		super(titulo, descripcion);
		this.material = material;
		this.dependencias = new ArrayList<Tarea>();
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public List<Tarea> getDependencias() {
		return dependencias;
	}

	public void setDependencias(List<Tarea> dependencias) {
		this.dependencias = dependencias;
	}

	public void editarTarea(String titulo, String descripcion, String material, List<Tarea> dependencias) {
		super.setTitulo(titulo);
		super.setDescripcion(descripcion);
		this.setMaterial(material);
		this.setDependencias(dependencias);
	}
}

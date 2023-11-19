package ar.edu.unlp.info.oo1.ListaDeTareas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTareas {
	
	private List<Tarea> tareas;
	
	public ListaDeTareas() {
		this.tareas = new ArrayList<Tarea>();
	}

	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}
	
	public void agregarTareaSimple(Simple simple) {
		this.tareas.add(simple);
	}
	
	public void agregarTareaCompleja(Compleja compleja) {
		this.tareas.add(compleja);
	}
	
	public void eliminarTarea(Tarea tarea) {
		this.tareas.remove(tarea);
	}
	
	public void ordenarTareas() {
		
	}
	
}

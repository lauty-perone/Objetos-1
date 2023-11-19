package ar.edu.unlp.info.oo1.ListaDeTareas;

public class Simple extends Tarea {

	public Simple(String titulo, String descripcion) {
		super(titulo, descripcion);		
	}
	
	public void editarTarea(String titulo, String descripcion) {
		super.setTitulo(titulo);
		super.setDescripcion(descripcion);
	}

	
}

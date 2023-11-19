package ar.edu.unlp.info.oo1.ejercicio18ChatGPT;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	
	private List<Empleado> empleados;
	
	public Sistema() {
		this.empleados = new ArrayList<Empleado>();
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	public Empleado buscarEmpleado (String cuil) {
		return this.empleados.stream()
							 .filter(empleado -> empleado.getCuil().equals(cuil))
							 .findAny().orElse(null);
	}
	
	public void eliminarEmpleado (Empleado empleado) {
		this.empleados.remove(empleado);
	}
	
	public List<Empleado> empleadosConContratosVencidos(){
		return this.empleados.stream()
							 .filter(empleado -> empleado.devolverContratoActualVencido())
							 .collect(Collectors.toList());
	}
}

package ar.edu.unlp.info.oo1.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	
	private boolean estado;
	private Farola FarolaVecina;
	
	public Farola() {
		this.estado = false;
		this.FarolaVecina = null;
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		this.FarolaVecina = otraFarola;
	}
	
	public List<Farola> getNeighbors(){
		List<Farola> farolaVecina = new ArrayList<Farola>();
		farolaVecina.add((Farola) FarolaVecina.getNeighbors());
		return farolaVecina;
	}
	
	public void turnOn() {
		if (!this.estado) {
			this.estado = true;
			this.FarolaVecina.turnOn();
		}
	}
	
	public void turnOff() {
		if (this.estado) {
			this.estado = false;
			this.FarolaVecina.turnOff();
		}
	}
	
	public boolean isOn() {
		return estado;
	}
	
	
}

package ar.edu.unlp.info.oo1.ejercicio4;

public class Circulo implements CaraBasal{

	private double radio;
	
	public Circulo() {
		
	}
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getDiametro() {
		return (this.radio * 2);
	}

	public void setDiametro(double diametro) {
		this.setRadio(diametro/2);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getPerimetro() {
		return Math.PI *this.getDiametro();
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}	
}

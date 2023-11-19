package ar.edu.unlp.info.oo1.ejercicio4;

public class Cuerpo3D {
	
	private double altura;
	private CaraBasal caraBasal;
	
	public Cuerpo3D() {
		
	}
	
	public Cuerpo3D(double altura, CaraBasal caraBasal) {
		this.altura = altura;
		this.caraBasal = caraBasal;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setCaraBasal(CaraBasal caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen() {
		return this.caraBasal.getArea() * this.altura;
	}
	
	public double getSuperficieExterior() {
		return 2 * this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.altura; 
	}
	
	
	
	
}

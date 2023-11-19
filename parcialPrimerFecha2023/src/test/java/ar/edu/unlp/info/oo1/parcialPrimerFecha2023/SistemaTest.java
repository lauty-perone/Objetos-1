package ar.edu.unlp.info.oo1.parcialPrimerFecha2023;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTest {
	
	private Sistema sistema;
	private Usuario inquilino,dueño;
	private Propiedad propiedad;
	
	@BeforeEach
	void setUp() throws Exception{
		this.sistema = new Sistema();
		this.inquilino = sistema.crearUsuario("43732185");
		this.dueño = sistema.crearUsuario("45321584");
		this.propiedad = dueño.registrarPropiedad(1000, "Mansión", "La Plata");
	}
	
	@Test
	void crearReservaTest() {
		
	}
	
}

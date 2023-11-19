package ar.edu.unlp.info.oo1.ParcialPrimer2023;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTest {
	
	private Sistema sistema;
	private Usuario propietario;
	private Propiedad propiedad;
	private Usuario inquilino;
	
	@BeforeEach
	void setUp() throws Exception{
		this.sistema = new Sistema();
		this.propietario =  new Usuario(43732185);
		this.propiedad =  propietario.agregarPropiedad(100.0, "La choza", "La Plata");
		this.inquilino =  sistema.registrarUsuario(44123456);
		
	}
	
	@Test
	void crearReservaTest() {
		LocalDate hoy = LocalDate.now();
		LocalDate mañana = hoy.plusDays(1);
		
		Reserva r = this.propiedad.crearReserva(inquilino, hoy, mañana);
		assertNotNull(r);
		assertEquals(r.getPrecioFinal(), 200.0);
		assertNull(propiedad.crearReserva(inquilino, hoy, mañana));
		
		LocalDate reservaLargaFrom = hoy.plusDays(10);
		LocalDate reservaLargaTo = reservaLargaFrom.plusDays(9);
		LocalDate diaIntermedio = reservaLargaFrom.plusDays(4);
		
		propiedad.agregarReglaRango(10, reservaLargaFrom, diaIntermedio, false);
		propiedad.agregarReglaRango(10, diaIntermedio.plusDays(1), reservaLargaTo, false);
		
		r = propiedad.crearReserva(inquilino, reservaLargaFrom, reservaLargaTo);
		assertEquals(r.getPrecioFinal(), 900.0);
		
		
	}
}

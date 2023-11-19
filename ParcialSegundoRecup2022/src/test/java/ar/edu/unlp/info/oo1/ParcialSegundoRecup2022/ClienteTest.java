package ar.edu.unlp.info.oo1.ParcialSegundoRecup2022;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;

public class ClienteTest {
	
	private Cliente cliente;
	private Sistema sistema;
	
	@BeforeEach
	void setUp() throws Exception{
		sistema = new Sistema();
		this.cliente = sistema.agregarCliente("Lautaro", "La Plata");
		Limpieza lim1= sistema.agregarServicioLimpieza(100, 5, 400);
		Limpieza lim2= sistema.agregarServicioLimpieza(400, 5, 400);
		LocalDate finde = LocalDate.of(2023, 5, 19);
		LocalDate diaDeSemana = LocalDate.of(2023, 5, 20);
		UnicaVez unicaFinde = cliente.agregarContratoUnico(lim2, finde);
		UnicaVez unicaSemana = cliente.agregarContratoUnico(lim2, diaDeSemana);
	}
	
	void montoAPagarTest() {
		assertEquals(null, null);
	}
}

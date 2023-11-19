package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InternacionalTest {
	
	private Internacional llamada1;
	private Internacional llamada2;
	
	@BeforeEach
	void setUp() throws Exception{
		this.llamada1 = new Internacional(LocalDateTime.of(LocalDate.of(2022, 5, 30), LocalTime.of(10,20)), 
											20,"Argentina","Peru");
		this.llamada2 = new Internacional(LocalDateTime.of(LocalDate.of(2022, 5, 30), LocalTime.of(23,20)), 
										 	20,"Argentina","Peru");
	}
	
	@Test
	void calcularCostoTest() {
		Assertions.assertEquals(80, this.llamada1.calcularCosto());
		Assertions.assertEquals(60, this.llamada2.calcularCosto());
	}
}

package ual.hmis.sesion05.ejercicio01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio01Test {

	
	@ParameterizedTest 
	@CsvSource({
		"4,1",
		"9,1",
		"35,7"
	})
	void testTransformar(int input, int expect) {
		//Arrange
		Ejercicio1 ej = new Ejercicio1();
		//Act
		int resultado = ej.transformar(input);
		//Assert
		assertEquals(expect, resultado);
	}

}

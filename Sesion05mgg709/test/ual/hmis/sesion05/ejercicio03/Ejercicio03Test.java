package ual.hmis.sesion05.ejercicio03;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio02.Ejercicio2;

public class Ejercicio03Test {
	
	@ParameterizedTest
	@CsvSource({
		"pas, Password demasiado corto",
		"passwo, ********",
		"passwordpassword, ************",
		"contraseniamuylargacontraseniamuylargacontraseniamuylarga, Password demasiado largo"
	})
	void casosCorrectos(String contra, String expected) {
		Ejercicio03 ej = new Ejercicio03(); 
		String resultado;
		resultado = ej.contrasenia(contra);
		assertEquals(expected,resultado);
	}
	
	@ParameterizedTest
	@CsvSource({
		"pasword, Password demasiado corto",
		"pas, ********",
		"passwordo, ********",
		"asswordpass, ************",
		"contraseniamuylargacontraseniamuylargacontraseniamuylarga, ************ "
	})
	void casosIncorrectos(String contra, String expected) {
		Ejercicio03 ej = new Ejercicio03(); 
		String resultado;
		resultado = ej.contrasenia(contra);
		assertNotEquals(expected,resultado);
	}
	
}

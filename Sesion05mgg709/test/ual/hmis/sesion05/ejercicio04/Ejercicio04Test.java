package ual.hmis.sesion05.ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import ual.hmis.sesion05.ejercicio03.Ejercicio03;

class Ejercicio04Test {

	@ParameterizedTest
	@CsvSource({
		"2, Suspenso",
		"6, Aprobado",
		"8, Notable",
		"9.2, Sobresaliente",
		"10, Matricula",
		"20, Error en la nota"
	})
	void testCalificacionCorrecto(double nota, String expected) {
		Ejercicio04 ej = new Ejercicio04(); 
		String resultado;
		resultado = ej.calificacion(nota);
		assertEquals(expected,resultado);
	}
	@ParameterizedTest
	@CsvSource({
		"2, Aprobado",
		"20, Suspenso",
		"-20, Suspenso",
		"6, Suspenso",
		"8, Sobresaliente",
		"9.2, Notable",
		"10, Error en la nota",
		"20, Matricula"
	})
	void testCalificacionIncorrecto(double nota, String expected) {
		Ejercicio04 ej = new Ejercicio04(); 
		String resultado;
		resultado = ej.calificacion(nota);
		assertNotEquals(expected,resultado);
	}
	
	@ParameterizedTest
	@MethodSource("providerNotas")
	void testcalculaCalificacionesCorrecto(double [] nota, String [] expected) {
		String resultado[];
		Ejercicio04 ej = new Ejercicio04(); 
		resultado = ej.calculaCalificaciones(nota);
		for (int i = 0; i < resultado.length; i++) {
			assertEquals(expected[i], resultado[i]);
		}
	}
	
	
private static Stream<Arguments> providerNotas(){
	
	double [] nota = {10, 8, 9, 5, 4};
	String[] expected = {"Matricula", "Notable", "Sobresaliente", "Aprobado", "Suspenso"};
		return Stream.of(Arguments.of(nota, expected));
	}

}

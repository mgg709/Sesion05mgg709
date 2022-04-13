package ual.hmis.sesion05.ejercicio02;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio02Test {

	@ParameterizedTest
	@CsvSource({
		"user,pass,true",
		"ususario,contrasenia,false"
	})
	void loginTestCorrecto(String usuario, String contrasenia, boolean expected) {
		Ejercicio2 ej = new Ejercicio2(); 
		boolean resultado = ej.login(usuario, contrasenia);
		assertEquals(expected,resultado);
	}
	
	@ParameterizedTest
	@CsvSource({
		"'',pass,false",
		"user,'',false"
	})
	void loginTestUsuarioContraseniaNulos(String usuario, String contrasenia, boolean expected){
		Ejercicio2 ej = new Ejercicio2(); 
		boolean resultado = ej.login(usuario, contrasenia);
		assertEquals(expected,resultado);
	}

	@ParameterizedTest
	@CsvSource({
		"usuario,passwordpasswordpasswordpasswordpasswordpassword,false",
		"usuariousuariousuariousuariousuario,password,false"
	})
	void longitudMayorQue30(String usuario, String contrasenia, boolean expected){
		Ejercicio2 ej = new Ejercicio2(); 
		boolean resultado = ej.login(usuario, contrasenia);
		assertEquals(expected,resultado);
	}
	
	@ParameterizedTest
	@CsvSource({
		"user,password,false",
		"ususario,pass,false"
	})
	void loginTestIncorrecto(String usuario, String contrasenia, boolean expected) {
		Ejercicio2 ej = new Ejercicio2(); 
		boolean resultado = ej.login(usuario, contrasenia);
		assertEquals(expected,resultado);
	}
}

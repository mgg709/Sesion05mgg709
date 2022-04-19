package ual.hmis.sesion05.ejercicio05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import ual.hmis.sesion05.ejercicio04.Ejercicio04;

public class Ejercicio05Test {

	@ParameterizedTest
	@MethodSource("providerListas")
	void testLista02Vacia(ArrayList<String> lista1, ArrayList<String> lista2, String [] expected) {
		
		Ejercicio05 ej= new Ejercicio05();
		ArrayList<String> resultado = ej.listaOrdenadaEstudiantes(lista1, lista2);
		for(int i = 0; i < resultado.size(); i++) {
			assertEquals(expected[i], resultado.get(i));
		}
		
		
	}
	
private static Stream<Arguments> providerListas(){
	
	ArrayList<String> lista1 = new ArrayList<String>();
	lista1.add("AlvarezAlvarezMiguel");
	lista1.add("ZarateZarateJuan");
	
	ArrayList<String> lista2 = new ArrayList<String>();
	
	ArrayList<String> lista3 = new ArrayList<String>();
	lista3.add("GarciaGarciaMiguel");
	lista3.add("GomezPerezAlberto");
	lista3.add("ZarateZarateJuan");
	
	ArrayList<String> lista4 = new ArrayList<String>();
	lista4.add("AlvarezAlvarezMiguel");
	lista4.add("ZarateZarateJuan");
	lista4.add("ZarateZarateJuan");
	
	String[] expected = {"AlvarezAlvarezMiguel", "ZarateZarateJuan"};
	String[] expected2 = {""};
	String[] expected3 = {"AlvarezAlvarezMiguel", "GarciaGarciaMiguel", "GomezPerezAlberto", "ZarateZarateJuan"};
	
		return Stream.of(
				Arguments.of(lista1, lista2, expected),
				Arguments.of(lista2, lista2, expected2),
				Arguments.of(lista2, lista1, expected),
				Arguments.of(lista4, lista3, expected3)
				);
	}
	
}

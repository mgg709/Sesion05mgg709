package ual.hmis.sesion05.ejercicio05;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio05 {
	
	
	
	public ArrayList<String >listaOrdenadaEstudiantes(ArrayList<String> lista1, ArrayList<String> lista2){
		
		ArrayList<String> asignaturas = new ArrayList<String>();
		lista1.sort(null);
		lista2.sort(null);
		
		if(!lista1.isEmpty() && lista2.isEmpty()) {
			
			return lista1;
			
		}
		
		else if(lista1.isEmpty() && lista2.isEmpty()) {
			return asignaturas;
		}
		else if(lista1.isEmpty() && !lista2.isEmpty()) {
			return lista2;
		}
		else {
			
			for(int i = 0; i < lista1.size() ; i++) {
				if(asignaturas.contains(lista1.get(i))) {
					continue;
				}
				asignaturas.add(lista1.get(i));
			}
			
			for(int i = 0; i < lista2.size() ; i++) {
				if(asignaturas.contains(lista2.get(i))) {
					continue;
				}
				asignaturas.add(lista2.get(i));
			}
			
			asignaturas.sort(null);
			return asignaturas;
			
		}
		
		
		
	}

}

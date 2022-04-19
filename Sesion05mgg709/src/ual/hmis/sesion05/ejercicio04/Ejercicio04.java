package ual.hmis.sesion05.ejercicio04;

public class Ejercicio04 {

	public String[] calculaCalificaciones(double[] notas){
	
		String [] calificaciones = new String[notas.length];
		String calificacionV = "";
		for (int i = 0; i < notas.length; i++) {
			calificacionV = calificacion(notas[i]);
			calificaciones[i] = calificacionV;
		}
		return calificaciones;
	}
	public String calificacion(double nota){
		
		if (nota > 0 && nota <=4.9) {
			return "Suspenso";
		}
		else if (nota >= 5 && nota <= 6.9) {
			return "Aprobado";
		}
		else if (nota >= 7 && nota <= 8.9) {
			return "Notable";
		}
		else if (nota >= 9 && nota <= 9.9) {
			return "Sobresaliente";
		}
		else if (nota == 10) {
			return "Matricula";
		}
		else {
			return "Error en la nota";
		}

	}
}

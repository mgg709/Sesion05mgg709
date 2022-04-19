package ual.hmis.sesion05.ejercicio06;

import java.util.Scanner;

public class CartaMasAlta {

	public static void main(String[] args) {
		
		Deck baraja = new Deck();
		
		baraja.shuffle();
		Scanner scan = new Scanner(System.in);
		System.out.println("------------------- JUEGO DE CARTA MÁS ALTA -------------------");
		
		System.out.println("Cantidad inicial de dinero = 10€");
		int dinero = 10;
		do {
		System.out.println("MENU:");
		System.out.println("1- Jugar");
		System.out.println("2- Salir");
		System.out.println("Escoge una opción");
		int opcion = scan.nextInt();
		if (opcion == 1) {
		System.out.println("Introduzca la cantidad para apostar:");
		int apuesta = scan.nextInt();
		if(apuesta > dinero) {
			System.out.println("No puede introducir una cantidad mayor al dinero que posee en el banco");
			continue;
		}
		Card cartaJugador = baraja.dealCard();
		System.out.println("Su carta es:" + cartaJugador.getSuitAsString() + " " + cartaJugador.getValueAsString());
		Card cartaBanca = baraja.dealCard();
		System.out.println("La carta de la banca es:" + cartaBanca.getSuitAsString() + " " + cartaBanca.getValueAsString());
		
		if(cartaJugador.getValue() > cartaBanca.getValue()) {
			System.out.println("Su carta es más alta, HA GANADO!!");
			dinero+=apuesta;
			System.out.println("Su dinero actual es " + dinero);
		}
		else if(cartaJugador.getValue() < cartaBanca.getValue()) {
			System.out.println("Su carta es más baja, ha perdido :(");
			dinero-=apuesta;
			System.out.println("Su dinero actual es " + dinero);
		}
		else {
			System.out.println("Su carta tiene el mismo valor que el de la banca, EMPATE");
		}
		}
		if(opcion == 2) {
			break;
		}
		}while(dinero>0);
		if(dinero == 0) {
			System.out.println("Has perdido tu dinero, para volver a jugar venda el coche o la casa");
		}
		System.out.println("Partida finalizada");
	}
}

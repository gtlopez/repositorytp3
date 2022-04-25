package fi.unju.edu.ar.Ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	
	public static void main(String[] args) {
		String frutaIngresada;
		boolean seguir = true;
		boolean responder;
		ArrayList<String> frutas = new ArrayList<>();
		char respuesta;
		
		Scanner teclado = new Scanner(System.in);	
		System.out.println("Permite almacenar elementos de tipo String en un objeto de la clase ArrayList.");
		do {
			
			System.out.print("Ingrese el nombre de una fruta: ");
			frutaIngresada = teclado.nextLine();
			frutas.add(frutaIngresada);
			responder = false;
			while (!responder) {
				System.out.print("\nDesea agregar otro nombre de fruta? (S/N): ");
				respuesta = teclado.next().charAt(0);
				if (respuesta == 's' || respuesta == 'S')
					responder = true;
				if (respuesta == 'n' || respuesta == 'N') {
					responder = true;
					seguir = false;
				}
			}
			teclado.nextLine();
		} while (seguir);
		
		System.out.println("\nLista de frutas que tienen índice par en el ArrayList.");
		for(int i = 0; i < frutas.size(); i++) {
			if(i % 2 == 0) {
				System.out.println("frutas[" + i + "]= " + frutas.get(i));
			}	
		}
		seguir=true;
		do {
			try {
				System.out.println("\nIngreso un número entero positivo  que represente un indice de un elemento "
						+ "del ArraList para eliminarlo.");
				System.out.print("Ingrese un numero: ");
				int n = teclado.nextInt();
				if (n >= 0 && n <= frutas.size()) {
					System.out.println("frutas[" + n + "] = " + frutas.get(n) + " es el elemento a borrar.");
					frutas.remove(n);
					seguir=false;
					}else
						System.out.println("Numero fuera del rango requerido: [0;"+ (frutas.size()-1) + "]");	
			} catch (Exception ex) {
				System.out.println("Valor ingresado no permitido");
				teclado.next();
			}
		} while (seguir);
		System.out.print("\nElementos finales que posee el ArrayList 'frutas': ");
		for(int z = 0; z < frutas.size(); z++) {
			System.out.print(frutas.get(z) + " ");
		}
		System.out.println("\nCantidad de elementos que contiene el ArrayList 'frutas': " + frutas.size());		
	}
}	
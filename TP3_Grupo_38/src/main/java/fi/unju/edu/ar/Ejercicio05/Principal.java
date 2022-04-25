package fi.unju.edu.ar.Ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		char[] cadenaCaracteres;
		String cadena;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese una cadena String por consola, por ejemplo: hola mundo!");
		System.out.print("Ingresar cadena: ");
		cadena = teclado.nextLine();

		// Covertir cadena String a un array tipo char
		cadenaCaracteres = cadena.toCharArray();
		char[] invertido = new char[cadenaCaracteres.length];
		int j = 0;
		for (int i = cadenaCaracteres.length - 1; i >= 0; i--) {
			invertido[j] = cadenaCaracteres[i];
			j++;

		}
		System.out.println();
		System.out.println("Visualizar cadena String ingresada en forma invertida");
		System.out.print("Cadena Invertida: '");
		for (int z = 0; z < invertido.length; z++) {
			System.out.print(invertido[z]);
		}
		System.out.print("'");
	}

}

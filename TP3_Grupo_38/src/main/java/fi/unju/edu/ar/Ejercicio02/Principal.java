package fi.unju.edu.ar.Ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		Boolean seguir = true;
		Boolean responder;
		int[] multiplicandos = new int[11];
		char respuesta;
		do {
			System.out.print("Introduce un número entero: ");
			n = teclado.nextInt();
			if (n > 0 && n <= 10) {
				System.out.println("Tabla del " + n);
				System.out.println("------------");
				for (int i = 1; i <= 10; i++) {
					multiplicandos[i] = i;
					System.out.println(n + " * " + multiplicandos[i] + " = " + n * multiplicandos[i]);
				}
			} else
				System.out.println("Numero fuera del rango requerido [1.10]");

			responder = false;
			while (!responder) {
				System.out.println();
				System.out.print("Desea ingresar otro numero? (S/N): ");

				respuesta = teclado.next().charAt(0);
				if (respuesta == 's' || respuesta == 'S')
					responder = true;
				if (respuesta == 'n' || respuesta == 'N') {
					responder = true;
					seguir = false;
					System.out.println("FIN");
				}
			}
		} while (seguir);
	}
}
package fi.unju.edu.ar.Ejercicio06;

import java.util.Scanner;


public class Principal {
	Scanner teclado = new Scanner(System.in);
	public int n;
	public int[] numeros = new int[10];

	public static void main(String[] args) {
		Principal principal6 = new Principal();
		principal6.ingresarNumeros();
		principal6.mostrarNumerosInvertidos();
		

	}
	public void ingresarNumeros() {
		System.out.println("Introducir 10 numeros enteros");
		System.out.print("----------------------------");
		System.out.println();
		System.out.println("Introduce un número entero: ");
		for (n = 0; n < numeros.length; n++) {
			System.out.print("Numero " + (n+1) + " = ");
			numeros[n] = teclado.nextInt();
		}
	}
	public void mostrarNumerosInvertidos() {
		System.out.println();
		System.out.print("Numeros Ingresados en orden original: ");
		for (n = 0; n < numeros.length; n++) {
			System.out.print(numeros[n] + " ");
	     }
		System.out.println();
		System.out.print("Numeros Ingresados en orden inverso: ");
		for (n = numeros.length - 1; n >= 0; n--) {
			System.out.print(numeros[n] + " ");
	     }
	}

}

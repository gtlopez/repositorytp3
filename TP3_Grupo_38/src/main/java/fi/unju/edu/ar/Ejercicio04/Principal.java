package fi.unju.edu.ar.Ejercicio04;

import java.util.Scanner;

public class Principal {
	Scanner teclado = new Scanner(System.in);
	public int n;
	public int[] numeros = new int[9];

	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.ingresarNumeros();
		principal.identificarParidad();
	}
	
	public void ingresarNumeros() {
		System.out.println("Introducir 9 numeros enteros");
		System.out.print("----------------------------");
		System.out.println();
		System.out.println("Introduce un número entero: ");
		for (n = 0; n < numeros.length; n++) {
			System.out.print("Numero " + (n+1) + "= ");
			numeros[n] = teclado.nextInt();
		}
	}
	
	public void identificarParidad() {
		System.out.println("Paridad de los Numeros Ingresados");
		for (n = 0; n < numeros.length; n++) {
			if (numeros[n] %2 == 0)
				System.out.println("El numero " + numeros[n] + " es Par ");
	        else 
	        	System.out.println("El numero " + numeros[n] + " es Impar");
		}
		
	}

}

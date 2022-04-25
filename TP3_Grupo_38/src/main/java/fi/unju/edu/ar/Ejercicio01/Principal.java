package fi.unju.edu.ar.Ejercicio01;

import java.util.Scanner;

public class Principal {
	
	int[] arreglo1;
	int[] arreglo2;
	
	public static void main(String[] args) {
		System.out.println("Ingrese los primeros 5 numeros enteros.");
		int[] arreglo1 = ingresarArray();
		System.out.println("Ingrese los segundos 5 numeros enteros.");
		int[] arreglo2 = ingresarArray();
		System.out.println("Resultado de la division de los valores de los dos arrays : ");
		dividirArray(arreglo1, arreglo2);

	}
	
	public static int[]  ingresarArray() {
		Scanner teclado = new Scanner(System.in);
		int[] auxiliar= new int[5];
		for (int n = 0; n < auxiliar.length; n++) {
			System.out.print("auxiliar[" + n + "]= ");
			auxiliar[n] = teclado.nextInt();
		}
		return auxiliar;	
	}
	
	public static void dividirArray(int[] array1, int[] array2) {
		double resultado = 0;
		for (int n = 0; n < array1.length; n++) {
			try {
				resultado = array1[n] / array2[n];
				System.out.println("Division " + (n + 1) + ": " + resultado);
			} catch (Exception e) {
				if (array2[n] == 0)
					System.out.print("Division " + (n + 1) + ": ");
				System.out.println("Error: Division por 0");
			}
		}
		
	}
		
		
	

}
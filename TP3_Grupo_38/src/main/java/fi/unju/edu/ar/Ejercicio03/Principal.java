package fi.unju.edu.ar.Ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[5];
		
		System.out.println("Ingrese por consola los datos del Alumno");	
		System.out.print("Ingrese Nombre del Alumno: ");
		String nombre = teclado.next();
		System.out.print("Ingrese Apellido del Alumno: ");
		String apellido = teclado.next();
		System.out.print("Ingrese Libreta Universitaria: ");
		int lu = teclado.nextInt();
		System.out.println("Ingrese las notas del Alumno: ");
		for (int n = 0; n < notas.length; n++) {
			System.out.print("Nota [" + (n+1) + "]= ");
			notas[n] = teclado.nextInt();
		}
		Alumno unAlumno = new Alumno(nombre, apellido, lu, notas);
		System.out.println("Nombre del Alumno: " + unAlumno.getNombre());
		System.out.println("Apellido del Alumno: " + unAlumno.getApellido());
		System.out.println("Libreta Universitaria: " + unAlumno.getLibretaUniversitaria());
		System.out.println("Notas del Alumno: ");
		for (int n = 0; n < unAlumno.getNotas().length; n++) {
			System.out.println("Nota [" + (n+1) + "]= " + unAlumno.getNotas()[n]);
		}
		System.out.println("Promedio del Alumno: " + unAlumno.calcularPromedio());
		System.out.println("Maxima Nota del Alumno: " + unAlumno.obtenerNotaMaxima());
		
		

	}

}

package fi.unju.edu.ar.Ejercicio08;

public class Alumno {
	private String nombre;
	private String apellido;
	private int libretaUniversitaria;
	private double[] notas;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, String apellido, int libretaUniversitaria, double[] notas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.libretaUniversitaria = libretaUniversitaria;
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getLibretaUniversitaria() {
		return libretaUniversitaria;
	}

	public void setLibretaUniversitaria(int libretaUniversitaria) {
		this.libretaUniversitaria = libretaUniversitaria;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularPromedio() {
		double suma = 0;
		for (int i=0; i < this.notas.length; i++) {
			suma+=this.notas[i];
		}
		double promedio=suma/this.notas.length;
		return promedio;
	}
	
	public double obtenerNotaMaxima() {
		double maxima = this.notas[0];
		for (int i=0; i < this.notas.length; i++) {
			if (this.notas[i] > maxima)
				maxima = (this.notas[i]);	
		}
		return maxima;	
	}

	
}

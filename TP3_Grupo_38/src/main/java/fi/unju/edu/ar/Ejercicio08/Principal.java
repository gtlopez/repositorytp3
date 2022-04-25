package fi.unju.edu.ar.Ejercicio08;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// ArrayList<Alumno> arrayAlum = new ArrayList<Alumno>();
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		Scanner teclado = new Scanner(System.in);
		int opcion;
		boolean seguir = true;
		do {
			System.out.println("----------------------------------------------------");
			System.out.println("ArrayList para almacenar objetos de la clase Alumno.");
			System.out.println("----------------------------------------------------");
			System.out.println("                 OPCIONES ");
			System.out.println("1– Nuevo alumno (Agregar)");
			System.out.println("2– Eliminar alumno");
			System.out.println("3– Modificar notas alumno");
			System.out.println("4– Mostrar todos los alumnos");
			System.out.println("5- Mostrar los que superan el promedio de 6");
			System.out.println("6– Salir");

			try {
				System.out.print("Elija una Opcion: ");
				opcion = teclado.nextInt();
				switch (opcion) {
				case 1:
					double[] notas = new double[5];
					Alumno unAlumno = new Alumno();
					boolean luControl = true;
					System.out.println("Ingrese por consola los datos del Alumno");
					System.out.print("Ingrese Nombre del Alumno: ");
					unAlumno.setNombre(teclado.next());
					System.out.print("Ingrese Apellido del Alumno: ");
					unAlumno.setApellido(teclado.next());
					while (luControl) {
						System.out.print("Ingrese Libreta Universitaria: ");
						int luAux = teclado.nextInt();
						if (luAux > 0 && luAux <= 9999) {
							unAlumno.setLibretaUniversitaria(luAux);
							luControl = false;
						} else
							System.out.println("Error: Libreta Universitaria [1;9999]");
					}

					System.out.println("Ingrese las notas del Alumno: ");
					for (int n = 0; n < notas.length; n++) {
						try {
							System.out.print("Nota [" + (n + 1) + "] = ");
							notas[n] = teclado.nextInt();
						} catch (Exception e) {
							System.out.println("Ingreso erroneo de la nota del alumno");
							teclado.next();
						}
					}
					unAlumno.setNotas(notas);
					alumnos.add(unAlumno);
					break;
				case 2:
					try {
						boolean existe = false;
						int indice = 0;
						System.out.println("Eliminar un Alumno");
						System.out.print("Ingrese el nro de Libreta Universitaria del alumno: ");
						int luAux = teclado.nextInt();
						for (int i = 0; i < alumnos.size(); i++) {
							Alumno auxAlumno = alumnos.get(i);
							if (auxAlumno.getLibretaUniversitaria() == luAux) {
								existe = true;
								indice = i;
								break;
							}
						}
						if (existe) {
							System.out.println("Alumno: " + alumnos.get(indice).getApellido() + ", "
									+ alumnos.get(indice).getNombre() + " sera eliminado");
							alumnos.remove(indice);
						} else {
							System.out.println("Libreta Univ. no encontrada");
						}
						break;
					} catch (Exception e) {
						System.out.println("Error. Libreta Universitaria");
						teclado.next();
					}

				case 3:
					try {
						Alumno auxAlumno = new Alumno();
						boolean existe = false;
						int indice = 0;
						System.out.println("Modificar las Notas del Alumno");
						System.out.print("Ingrese el nro de Libreta Universitaria del alumno: ");
						int luAux = teclado.nextInt();
						for (int i = 0; i < alumnos.size(); i++) {
							auxAlumno = alumnos.get(i);
							if (auxAlumno.getLibretaUniversitaria() == luAux) {
								existe = true;
								indice = i;
								break;
							}
						}
						if (existe) {
							System.out.println("Alumno: " + alumnos.get(indice).getApellido() + ", "
									+ alumnos.get(indice).getNombre());

							auxAlumno = alumnos.get(indice);

							for (int n = 0; n < auxAlumno.getNotas().length; n++) {
								try {
									System.out.print("Nota [" + (n + 1) + "] = ");
									auxAlumno.getNotas()[n] = teclado.nextInt();
								} catch (Exception e) {
									System.out.println("Ingreso erroneo de la nota del alumno");
									teclado.next();
								}
							}
							alumnos.get(indice).setNotas(auxAlumno.getNotas());
						} else {
							System.out.println("Libreta Univ. no encontrada");
						}
						break;
					} catch (Exception e) {
						System.out.println("Error. Libreta Universitaria");
						teclado.next();
					}
					break;
				case 4:
					System.out.println("--------------------");
					System.out.println("Alumnos Ingresados:");
					System.out.println("--------------------");
					for (int i = 0; i < alumnos.size(); i++) {
						System.out.println("Nombre del Alumno: " + alumnos.get(i).getNombre());
						System.out.println("Apellido del Alumno: " + alumnos.get(i).getApellido());
						System.out.println("Libreta U.del Alumno: " + alumnos.get(i).getLibretaUniversitaria());
						System.out.println("Notas del Alumno:");
						for (int n = 0; n < 5; n++) {
							System.out.println("Nota [" + (n + 1) + "] = " + alumnos.get(i).getNotas()[n]);
						}
					}
					break;
				case 5:
					System.out.println("Mostrar los Alumnos que superan el promedio de 6");
					System.out.println("   Nombre   " + "   Apellido   " + "    LU    " + "   Promedio   ");
					System.out.println("--------------------------------------------------");
					for (int i = 0; i < alumnos.size(); i++) {
						if (alumnos.get(i).calcularPromedio() > 6) {
							System.out.println(alumnos.get(i).getNombre() + "        " + alumnos.get(i).getApellido()
									+ "        " + "    " + alumnos.get(i).getLibretaUniversitaria() + "      "
									+ alumnos.get(i).calcularPromedio());
						}

					}

					break;
				case 6:
					System.out.println("SALIR");
					seguir = false;
					break;

				default:
					System.out.println("Error: Debe ingresar un numero entre [1;6]");
					break;
				}

			} catch (Exception e) {
				System.out.println("Error: Debe ingresar un numero entre [1;6]");
				teclado.next();
			}

		} while (seguir);
	}
}

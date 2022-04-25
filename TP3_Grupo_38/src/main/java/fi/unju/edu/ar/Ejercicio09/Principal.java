package fi.unju.edu.ar.Ejercicio09;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static ArrayList<Producto> productos = new ArrayList<Producto>();
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		boolean seguir = true;
		int opcion;
		// Principal principal = new Principal();
		do {
			menu();
			try {
				System.out.print("Ingrese una opción: ");
				opcion = teclado.nextInt();
				switch (opcion) {
				case 1:
					agregarProducto();
					break;
				case 2:
					mostrarProductos();
					break;
				case 3:
					IncrementarPrecioProductos();
					break;
				case 4:
					sumarMontoTotalPrecios();
					break;
				case 5:
					System.out.println("FIN de todo");
					seguir = false;
					break;
				default:
					break;
				}

			} catch (Exception e) {
				System.out.println("Error: Debe ingresar un numero entre [1;5]");
				teclado.next();

			}

		} while (seguir);

	}

	public static void menu() {
		System.out.println("\n========================");
		System.out.println("    Menu de Opciones    ");
		System.out.println("========================");
		System.out.println("<1> Nuevo producto");
		System.out.println("<2> Mostrar todos los productos");
		System.out.println("<3> Incrementar precio a todos los productos");
		System.out.println("<4> Monto total de todos los productos");
		System.out.println("<5> Fin");
		System.out.print("\nElija una opción: ");
	}

	public static void agregarProducto() {
		int codigo = 0;
		double precio = 0.;
		boolean codigoControl = true;
		boolean precioControl = true;
		while (codigoControl) {
			System.out.print("Ingresar Codigo de Producto: ");
			try {
				codigo = teclado.nextInt();
				if (codigo > 0) {
					codigoControl = false;
				} else
					System.out.println("Error: Codigo Incorrecto");

			} catch (Exception e) {
				System.out.println("Error: Codigo Incorrecto");
				teclado.next();
			}
		}

		System.out.print("Ingresar Descripcion del Producto: ");
		String descripcion = teclado.next();

		while (precioControl) {
			System.out.print("Ingresar el precio del Producto: ");
			try {
				precio = teclado.nextDouble();
				if (precio > 0) {
					precioControl = false;
				} else
					System.out.println("Error: Precio Incorrecto");

			} catch (Exception e) {
				System.out.println("Error: Precio Incorrecto");
				teclado.next();
			}
		}
		System.out.print("Ingresar marca: ");
		String marca = teclado.next();

		Producto auxProducto = new Producto(codigo, descripcion, precio, marca);
		productos.add(auxProducto);

		System.out.println("Producto Ingresado");
	}

	public static void mostrarProductos() {
		System.out.print("Código       ");
		System.out.print("Descripcion             ");
		System.out.print("Precio        ");
		System.out.print("Marca     ");
		System.out.println("\n============================================================");
		for (Producto prod : productos) {

			System.out.print(prod.getCodigo());
			System.out.print("         " + prod.getDescripcion());
			System.out.print("             " + prod.getPrecio());
			System.out.print("       " + prod.getMarca());
			System.out.println();
		}
	}

	public static void IncrementarPrecioProductos() {
		System.out.println("Incrementar el precio de todos los productos en 100,25$");
		for (Producto prod : productos) {
			prod.setPrecio(prod.getPrecio() + 100.25);
		}
		System.out.println("=====================");
		System.out.println("Precios Incrementados");
		System.out.println("=====================");
	}

	public static void sumarMontoTotalPrecios() {
		double Montototal = 0.0;
		for (Producto prod : productos) {
			mostrarProductos();
			Montototal += prod.getPrecio();
		}
		System.out.println("\nTotal precio:           " + Montototal);
	}
}

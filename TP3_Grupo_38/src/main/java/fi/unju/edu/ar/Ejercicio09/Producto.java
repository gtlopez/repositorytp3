package fi.unju.edu.ar.Ejercicio09;

public class Producto {
	private int codigo;
	private String descripcion;
	private double precio;
	private String marca;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(int codigo, String descripcion, double precio, String marca) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.marca = marca;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}

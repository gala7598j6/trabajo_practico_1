package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	String Nombre;
	String Codigo;
	float Precio;
	int Descuento;
	
	public Producto() {
		
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public float getPrecio() {
		return Precio;
	}

	public void setPrecio(float precio) {
		Precio = precio;
	}

	public int getDescuento() {
		return Descuento;
	}

	public void setDescuento(int descuento) {
		Descuento = descuento;
	}
	
	public float calcularDescuento(int n) {
		
		return this.Precio - this.Precio*(n/100f);
	}
	
}

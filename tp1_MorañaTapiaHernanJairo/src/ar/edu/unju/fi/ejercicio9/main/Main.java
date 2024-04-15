package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		float n;
		String nombreP;
		String codigoP;
		float precioP;
		int descuentoP;
		
		for(int i=0;i<=2;i++) {
			System.out.print("Ingrese nombre del producto: ");
			nombreP = leer.next();
			System.out.print("Ingrese el codigo del producto: ");
			codigoP = leer.next();
			System.out.print("Ingrese el precio del producto: ");
			precioP = leer.nextFloat();
			System.out.print("Ingrese el descuento del producto comprendido entre 0-50: ");
			descuentoP = leer.nextInt();
			Producto producto = new Producto();
			
			producto.setNombre(nombreP);
			producto.setCodigo(codigoP);
			producto.setPrecio(precioP);
			producto.setDescuento(descuentoP);
			
			System.out.println("Nombre del producto: "+producto.getNombre());
			System.out.println("Codigo del producto: "+producto.getCodigo());
			System.out.println("Precio del producto: $"+producto.getPrecio());
			System.out.println("Descuendo del "+descuentoP+"%, el total es: $"+producto.calcularDescuento(descuentoP));
			
		}
		leer.close();
	}

}

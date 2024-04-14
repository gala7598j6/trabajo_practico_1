package ar.edu.unju.fi.ejercicio7.main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese datos del empleado");
		System.out.print("Nombre: ");
		String nombre = leer.next();
		System.out.print("Legajo: ");
		int legajo = leer.nextInt();
		System.out.print("Salario: ");
		float salario = leer.nextFloat();
		Empleado empleado = new Empleado(nombre, legajo, salario);
		
		empleado.mostrarDatos();
		empleado.aumentoSalario();
		empleado.mostrarDatos();
		
		leer.close();
	}

}

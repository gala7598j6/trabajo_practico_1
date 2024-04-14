package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.model.Persona;

import java.time.LocalDate;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		///////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Objeto 1 sin parametros");
		Persona persona1 = new Persona();
		System.out.print("Ingrese DNI: ");
        int dni = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese fecha de nacimiento (yyyy-mm-dd): ");
        String fechaString = leer.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(fechaString);
        System.out.print("Ingrese provincia: ");
        String provincia = leer.nextLine();
        
        persona1.setDni(dni);
        persona1.setNombre(nombre);
        persona1.setFechaDeNacimiento(fechaNacimiento);
        persona1.setProvincia(provincia);
        
        
        ///////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Obeto 2 parametrizado");
        System.out.print("Ingrese DNI: ");
        int dni2 = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre2 = leer.nextLine();
        System.out.print("Ingrese fecha de nacimiento (yyyy-mm-dd): ");
        String fechaString2 = leer.nextLine();
        LocalDate fechaNacimiento2 = LocalDate.parse(fechaString2);
        System.out.print("Ingrese provincia: ");
        String provincia2 = leer.nextLine();

        Persona persona2 = new Persona(dni2, nombre2, fechaNacimiento2, provincia2);
        ///////////////////////////////////////////////////////////////////////////////////////////
		
        System.out.println("Objeto 3 parametrizado con un atributo inicializado Provincia");
        System.out.print("Ingrese DNI: ");
        int dni3 = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre3 = leer.nextLine();
        System.out.print("Ingrese fecha de nacimiento (yyyy-mm-dd): ");
        String fechaString3 = leer.nextLine();
        LocalDate fechaNacimiento3 = LocalDate.parse(fechaString3);
		
		Persona persona3 = new Persona(dni3, nombre3, fechaNacimiento3);
		///////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("***Datos de la persona 1***");
        System.out.println("DNI: " + persona1.getDni());
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Fecha de nacimiento: " + persona1.getFechaDeNacimiento());
        System.out.println("Provincia: " + persona1.getProvincia());
        
        System.out.println("***Datos de la persona 2***");
		persona2.mostrarDatos();
		
		System.out.println("***Datos de la persona 3***");
		persona3.mostrarDatos();
	}

}

package ar.edu.unju.fi.ejercicio12.main;


import ar.edu.unju.fi.ejercicio12.model.*;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner leer = new Scanner(System.in);

    	System.out.print("Ingrese el nombre: ");
    	String nombre = leer.nextLine();

    	System.out.print("Ingrese la fecha de nacimiento (en formato dd/mm/aaaa): ");
    	String fechaNacimientoStr = leer.nextLine();

    	int dia = Integer.parseInt(fechaNacimientoStr.substring(0, 2));
    	int mes = Integer.parseInt(fechaNacimientoStr.substring(3, 5)) - 1; 
    	int anio = Integer.parseInt(fechaNacimientoStr.substring(6));
    	Calendar fechaNacimiento = Calendar.getInstance();
    	fechaNacimiento.set(anio, mes, dia);

       
        Persona persona = new Persona(nombre, fechaNacimiento);

   
        System.out.println("\nDatos de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + fechaNacimientoStr);
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.determinarSignoZodiaco());
        System.out.println("Estación: " + persona.determinarEstacion());

        leer.close();
        
    }
}

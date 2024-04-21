package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

        
        String[] nombres = new String[5];

        
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre de la persona [" +i+ "]: ");
            nombres[i] = leer.nextLine();
        }

        
        System.out.println("Valores del array:");
        int n = 0;
        while (n < nombres.length) {
            System.out.println("Nombre [" + n + "]: " + nombres[n]);
            n++;
        }

        System.out.println("Tamanio del array: " + nombres.length);

        
        int indiceEliminar;
        do {
            System.out.print("Ingrese el indice a eliminar (0 - " + (nombres.length - 1) + "): ");
            indiceEliminar = leer.nextInt();
        } while (indiceEliminar < 0 || indiceEliminar >= nombres.length);

        
        for (int i = indiceEliminar; i < nombres.length - 1; i++) {
            nombres[i] = nombres[i + 1];
        }
        nombres[nombres.length - 1] = "";

        
        System.out.println("Array actualizado " + indiceEliminar + ":");
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }

        leer.close();
	}

}

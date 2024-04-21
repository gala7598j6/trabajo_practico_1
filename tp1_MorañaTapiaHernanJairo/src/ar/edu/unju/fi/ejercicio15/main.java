package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

        
        int tamanioArray;
        do {
            System.out.print("Ingrese un numero en el rango [5,10]: ");
            tamanioArray = leer.nextInt();
        } while (tamanioArray < 5 || tamanioArray > 10);

        
        String[] nombres = new String[tamanioArray];

        
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese un nombre pos [" + i + "]: ");
            nombres[i] = leer.next();
        }

        
        System.out.println("Contenido del array indice creciente:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Posicion [" + i + "]: " + nombres[i]);
        }

        
        System.out.println("Contenido del array indice decreciente:");
        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println("Posicion [" + i + "]: " + nombres[i]);
        }

        leer.close();
    }
	

}

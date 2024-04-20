package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

        
        int tamanioArray;
        do {
            System.out.print("Ingrese un numero entero en el rango [3, 10]: ");
            tamanioArray = leer.nextInt();
        } while (tamanioArray < 3 || tamanioArray > 10);

       
        int[] array = new int[tamanioArray];

        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese un numero en la posicion [" + i + "]: ");
            array[i] = leer.nextInt();
        }

        
        System.out.println("Valores del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion [" + i + "]: " + array[i]);
        }

        
        int suma = 0;
        for (int valor : array) {
            suma += valor;
        }
        System.out.println("La suma es: " + suma);

        leer.close();
	}

}

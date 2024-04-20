package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        int[] numeros = new int[8];

        
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Posicion [" + i + "] Valor: ");
            numeros[i] = leer.nextInt();
        }

        
        System.out.println("Valores almacenados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indice: " + i + ", Valor: " + numeros[i]);
        }

        leer.close();
    }
	

}

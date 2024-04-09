package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int num=11,i=1,fact=1;
		
		while (num > 10) {
			System.out.println("Ingrese un numero entero en el rango 0-10");
			num = leer.nextInt();
			if (num < 0 || num > 11) {
	            System.out.println("Fuera de rango");
	        } else {
	            while (i <= num) {
	                fact *= i;
	                i++;
	            }
	        }
		}
		System.out.println("El factorial de " + num + " es: " + fact);

	}

}

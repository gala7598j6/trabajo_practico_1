package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese un numero entero: ");
		num = leer.nextInt();
		
		if (num % 2!=0)
			System.out.println("Impar: "+num+" > "+num*2);
		else
			System.out.println("Par: "+num+" > "+num*3);
		
	}

}


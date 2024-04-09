package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int num,resultado;
		
		System.out.print("Por favor ingrese un numero entre 1 y 9: ");
        num = leer.nextInt();
		
		if (num < 1 || num > 9) {
            System.out.println("El numero ingresado no esta dentro del rango valido");
        } else {
           
            System.out.println("Tabla de multiplicar del " + num + ":");
            for (int i = 1; i <= 10; i++) {
                resultado = num * i;
                System.out.println(num + " x " + i + " = " + resultado);
            }
        }
		
		leer.close();
		//
	}

}

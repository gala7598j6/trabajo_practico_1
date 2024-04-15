package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		
		int n = leer.nextInt();
			
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		double resultado1 = calculadora.calcularSumatoria(n);
		int resultado2 = calculadora.calcularProductorial(n);
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		
		leer.close();
		
		
		
		
	}

}

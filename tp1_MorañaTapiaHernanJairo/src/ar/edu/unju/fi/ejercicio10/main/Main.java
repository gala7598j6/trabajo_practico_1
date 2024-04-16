package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int tamanio=0;
		double t=0;
		String stringBool;
		boolean especial;
		
		
		for(int i=1;i<=3;i++) {
			Pizza pizza = new Pizza();
			
			System.out.println("Ingrese el tamaño de la Pizza 20-30-40");
			tamanio = leer.nextInt();
			t=tamanio;
			leer.nextLine();
			System.out.println("Pizza especial ? true/false");
			stringBool = leer.nextLine();
			especial = Boolean.parseBoolean(stringBool);
			
			pizza.setDiametro(tamanio);
			pizza.setIngrdEspeciales(especial);
			
			System.out.println("**Pizza** "+i);
			System.out.println("Diametro = "+tamanio);
			System.out.println("Ingredientes especiales = "+especial);
			System.out.println("Precio Pizza = "+pizza.calcularPrecio());
			System.out.println("Area de la pizza = "+Math.PI * Math.pow(t/2, 2));
			
		}
		
		
		leer.close();
	}

}

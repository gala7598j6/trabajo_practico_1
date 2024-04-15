package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;

	public CalculadoraEspecial() {
		
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public double calcularSumatoria(int n) {
		double resultado=0;
		for (int i=1;i<=n;i++) {
			resultado += Math.pow((i*(i+1))/2, 2);
		}
		return resultado;
	}
	
	public int calcularProductorial(int n) {
		int resultado=1;
		for (int i=1;i<=n;i++) {
			resultado *= i*(i+4);
		}
		return resultado;
	}
	
	
}

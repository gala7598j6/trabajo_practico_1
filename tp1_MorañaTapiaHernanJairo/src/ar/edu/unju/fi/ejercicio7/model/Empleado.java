package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private float salario;
	
	private static final float salarioMinimo = 	210000f;
	private static final float aumento = 20000f;
	
	public Empleado(String nombre, int legajo, float salario) {
		
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = salario;
		
		if (salario >= salarioMinimo)
			this.salario = salario;
		else
			this.salario = salarioMinimo;
	}
	
	public void mostrarDatos() {
		System.out.println("***Datos del empleado***");
		System.out.println("Nombre del empleado: "+nombre);
		System.out.println("Legajo: "+legajo);
		System.out.println("salario $: "+salario);
	}
	
	public float aumentoSalario() {
		return this.salario = this.salario + aumento;
	}
	
	
	
	
	
	
	
}

package ar.edu.unju.fi.ejercicio6.model;
import java.time.LocalDate;
public class Persona {
	private int dni;
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private String provincia;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(int dni, String nombre, LocalDate fechaDeNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = provincia;
	}
	
	

	public Persona(int dni, String nombre, LocalDate fechaDeNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.provincia = "Jujuy";
    }

	public Persona(String provincia) {
		super();
		this.provincia = "Jujuy";
	}



	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public int calcularEdad() {
		return LocalDate.now().getYear() - fechaDeNacimiento.getYear();
	}
	
	public boolean esMayorDeEdad() {
		return calcularEdad()>=18;
	}
	
	public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaDeNacimiento);
        System.out.println("Provincia: " + provincia);
        System.out.println("Edad: " + calcularEdad());
        if (esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
	

	
}

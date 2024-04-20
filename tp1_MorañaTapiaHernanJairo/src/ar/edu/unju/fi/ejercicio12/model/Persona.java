package ar.edu.unju.fi.ejercicio12.model;


import java.util.Calendar;
import java.util.Date;

public class Persona {
    private String nombre;
    private Calendar fechaNacimiento;

    public Persona(String nombre, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        Calendar ahora = Calendar.getInstance();
        int edad = ahora.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (fechaNacimiento.get(Calendar.MONTH) > ahora.get(Calendar.MONTH) ||
                (fechaNacimiento.get(Calendar.MONTH) == ahora.get(Calendar.MONTH) &&
                        fechaNacimiento.get(Calendar.DAY_OF_MONTH) > ahora.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }
        return edad;
    }

    public String determinarSignoZodiaco() {
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1; 

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Geminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cancer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
    }

    public String determinarEstacion() {
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1; 
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);

        if ((mes == 12 && dia >= 21) || (mes == 1) || (mes == 2) || (mes == 3 && dia <= 20)) {
            return "Verano";
        } else if ((mes == 3 && dia >= 21) || (mes == 4) || (mes == 5) || (mes == 6 && dia <= 20)) {
            return "Otoño";
        } else if ((mes == 6 && dia >= 21) || (mes == 7) || (mes == 8) || (mes == 9 && dia <= 20)) {
            return "Invierno";
        } else {
            return "Primavera";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }
}


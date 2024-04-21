package ar.edu.unju.fi.ejercicio17.main;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 - Alta de jugador");
            System.out.println("2 - Mostrar los datos del jugador");
            System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 - Modificar los datos de un jugador");
            System.out.println("5 - Eliminar un jugador");
            System.out.println("6 - Mostrar la cantidad total de jugadores  que tiene el ArrayList");
            System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
            System.out.println("8 - Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();
            leer.nextLine(); 

            switch (opcion) {
                case 1:
                    altaJugador(leer, jugadores);
                    break;
                case 2:
                    mostrarDatosJugador(leer, jugadores);
                    break;
                case 3:
                    mostrarJugadoresOrdenados(jugadores);
                    break;
                case 4:
                    modificarDatosJugador(leer, jugadores);
                    break;
                case 5:
                    eliminarJugador(leer, jugadores);
                    break;
                case 6:
                    mostrarCantidadTotalJugadores(jugadores);
                    break;
                case 7:
                    mostrarCantidadJugadoresPorNacionalidad(leer, jugadores);
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("ERROR ingrese un numero del 1 al 8.");
            }
        } while (opcion != 8);

        leer.close();
    }

    private static void altaJugador(Scanner leer, ArrayList<Jugador> jugadores) {
        System.out.println("Ingrese los datos del jugador:");
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Apellido: ");
        String apellido = leer.nextLine();
        System.out.print("Fecha de nacimiento (yyyy-mm-dd): ");
        LocalDate fechaNacimiento = LocalDate.parse(leer.nextLine());
        System.out.print("Nacionalidad: ");
        String nacionalidad = leer.nextLine();
        System.out.print("Estatura: ");
        double estatura = leer.nextDouble();
        System.out.print("Peso: ");
        double peso = leer.nextDouble();
        leer.nextLine(); 

        Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, "");
        jugadores.add(jugador);
        System.out.println("Jugador agregado correctamente");
    }

    private static void mostrarDatosJugador(Scanner leer, ArrayList<Jugador> jugadores) {
        System.out.println("Ingrese el nombre y apellido del jugador:");
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Apellido: ");
        String apellido = leer.nextLine();

        boolean encontrado = false;
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Datos del jugador:");
                System.out.println("Nombre: " + jugador.getNombre());
                System.out.println("Apellido: " + jugador.getApellido());
                System.out.println("Fecha de nacimiento: " + jugador.getFechaNacimiento());
                System.out.println("Nacionalidad: " + jugador.getNacionalidad());
                System.out.println("Estatura: " + jugador.getEstatura());
                System.out.println("Peso: " + jugador.getPeso());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Jugador no encontrado.");
        }
    }

    private static void mostrarJugadoresOrdenados(ArrayList<Jugador> jugadores) {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores registrados");
            return;
        }

        ArrayList<Jugador> jugadoresOrdenados = new ArrayList<>(jugadores);
        Collections.sort(jugadoresOrdenados, Comparator.comparing(Jugador::getApellido));

        System.out.println("Jugadores ordenados por apellido:");
        for (Jugador jugador : jugadoresOrdenados) {
            System.out.println(jugador.getApellido() + ", " + jugador.getNombre());
        }
    }

    private static void modificarDatosJugador(Scanner leer, ArrayList<Jugador> jugadores) {
        System.out.println("Ingrese el nombre y apellido del jugador a modificar:");
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Apellido: ");
        String apellido = leer.nextLine();

        boolean encontrado = false;
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Ingrese los nuevos datos del jugador:");
                System.out.print("Nombre: ");
                String nuevoNombre = leer.nextLine();
                System.out.print("Apellido: ");
                String nuevoApellido = leer.nextLine();
                System.out.print("Fecha de nacimiento (yyyy-mm-dd): ");
                LocalDate nuevaFechaNacimiento = LocalDate.parse(leer.nextLine());
                System.out.print("Nacionalidad: ");
                String nuevaNacionalidad = leer.nextLine();
                System.out.print("Estatura: ");
                double nuevaEstatura = leer.nextDouble();
                System.out.print("Peso: ");
                double nuevoPeso = leer.nextDouble();
                leer.nextLine(); 

                jugador.setNombre(nuevoNombre);
                jugador.setApellido(nuevoApellido);
                jugador.setFechaNacimiento(nuevaFechaNacimiento);
                jugador.setNacionalidad(nuevaNacionalidad);
                jugador.setEstatura(nuevaEstatura);
                jugador.setPeso(nuevoPeso);
                System.out.println("Se modifico correctamente");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Jugador no encontrado");
        }
    }

    private static void eliminarJugador(Scanner leer, ArrayList<Jugador> jugadores) {
        System.out.println("Ingrese el nombre y apellido del jugador a eliminar:");
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Apellido: ");
        String apellido = leer.nextLine();

        Iterator<Jugador> iterator = jugadores.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            Jugador jugador = iterator.next();
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                iterator.remove();
                System.out.println("Se elimino correctamente");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Jugador no encontrado");
        }
    }

    private static void mostrarCantidadTotalJugadores(ArrayList<Jugador> jugadores) {
        System.out.println("Cantidad total de jugadores: " + jugadores.size());
    }

    private static void mostrarCantidadJugadoresPorNacionalidad(Scanner leer, ArrayList<Jugador> jugadores) {
        System.out.print("Ingrese la nacionalidad: ");
        String nacionalidad = leer.nextLine();

        int contador = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                contador++;
            }
        }
        System.out.println("Cantidad de jugadores de nacionalidad " + nacionalidad + ": " + contador);
    }
}


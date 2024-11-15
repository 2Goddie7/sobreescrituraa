package herenciaclase;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir datos para el jugador
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese el equipo del jugador: ");
        String equipo = input.nextLine();
        System.out.print("Ingrese la edad del jugador: ");
        int edad = input.nextInt();
        input.nextLine(); // Consumir el salto de línea

        // Crear objeto de la superclase Jugador
        Jugador player = new Jugador(nombre, equipo, edad);
        player.imprimir();

        // Pedir datos para el portero
        System.out.println();
        System.out.print("Ingrese el nombre del portero: ");
        String nombrePortero = input.nextLine();
        System.out.print("Ingrese el equipo del portero: ");
        String equipoPortero = input.nextLine();
        System.out.print("Ingrese la edad del portero: ");
        int edadPortero = input.nextInt();
        input.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el número de atajadas realizadas por el portero: ");
        int atajadasPortero = input.nextInt();
        input.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el número de goles recibidos por el portero: ");
        int golesRecibidosPortero = input.nextInt();
        input.nextLine(); // Consumir el salto de línea

        // Crear objeto de la subclase Portero
        Jugador.Portero player1 = new Jugador.Portero(nombrePortero, equipoPortero, edadPortero, atajadasPortero, golesRecibidosPortero);
        player1.imprimir();

        // Pedir datos para el defensa
        System.out.println();
        System.out.print("Ingrese el nombre del defensa: ");
        String nombreDefensa = input.nextLine();
        System.out.print("Ingrese el equipo del defensa: ");
        String equipoDefensa = input.nextLine();
        System.out.print("Ingrese la edad del defensa: ");
        int edadDefensa = input.nextInt();
        input.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el número de bloqueos del defensa: ");
        int bloqueosDefensa = input.nextInt();
        input.nextLine(); // Consumir el salto de línea

        // Crear objeto de la subclase Defensa
        Jugador.Defensa player2 = new Jugador.Defensa(nombreDefensa, equipoDefensa, edadDefensa, bloqueosDefensa);
        player2.imprimir();

        // Pedir datos para el delantero
        System.out.println();
        System.out.print("Ingrese el nombre del delantero: ");
        String nombreDelantero = input.nextLine();
        System.out.print("Ingrese el equipo del delantero: ");
        String equipoDelantero = input.nextLine();
        System.out.print("Ingrese la edad del delantero: ");
        int edadDelantero = input.nextInt();
        input.nextLine(); // Consumir el salto de línea

        // Crear objeto de la subclase Delantero
        Jugador.Delantero player3 = new Jugador.Delantero(nombreDelantero, equipoDelantero, edadDelantero);
        player3.imprimir();

        input.close();
    }
}
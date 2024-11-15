package herenciaclase;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Super clase
        Jugador player = new Jugador("Messi","Inter de Miami",38);
        player.imprimir();
        //Subclase portero con sus atributos
        System.out.println();
        Jugador.Portero player1 = new Jugador.Portero("Emiliano","Aston Villa",32,150,332);
        player1.imprimir();
        //Subclase defensa con sus atributos
        System.out.println();
        Jugador.Defensa player2 = new Jugador.Defensa("Cubarsí","FC Barcelona",17,242);
        player2.imprimir();
        //Subclase Delantero sin atributos extras atributos
        System.out.println();
        Jugador.Delantero player3= new Jugador.Delantero("Cristiano","Camello",39);
        player3.imprimir();
    }
}
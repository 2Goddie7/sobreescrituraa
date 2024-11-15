package herenciaclase;

public class Jugador {

    protected String nombre, equipo;
    protected int edad;

    public Jugador(String nombre, String equipo, int edad) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.edad = edad;
    }

    public void imprimir(){
        System.out.println("El nombre del equipo es: "+equipo);
        System.out.println("El nombre del jugador es: "+nombre);
        System.out.println("La edad del jugador es: "+edad);
    }

    public static class Portero extends Jugador{
        private int atajadas;
        private int golesREecibidos;
        public Portero(String nombre, String equipo, int edad, int atajadas, int golesREecibidos) {
            super(nombre, equipo, edad);
            this.atajadas=atajadas;
            this.golesREecibidos=golesREecibidos;
        }

        @Override
        public void imprimir() {
            super.imprimir();
            System.out.println("Atajadas realizadas: "+atajadas);
            System.out.println("Goles recibidos: "+golesREecibidos);
        }
    }

    public static class Defensa extends Jugador{
        private int bloqueos;
        public Defensa (String nombre, String equipo, int edad, int bloqueos) {
            super(nombre, equipo, edad);
            this.bloqueos=bloqueos;
        }

        @Override
        public void imprimir() {
            super.imprimir();
            System.out.println("El número de bloqueos del jugador son: "+bloqueos);
        }
    }

    public static class Delantero extends Jugador{
        public Delantero (String nombre, String equipo, int edad) {
            super(nombre, equipo, edad);
        }

        @Override
        public void imprimir() {
            super.imprimir();
        }
    }

}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre del equipo: ");
        String nombre = teclado.next();

        System.out.println("Universidad: ");
        String universidad = teclado.next();

        System.out.println("Lenguaje de programación: ");
        String lenguaje = teclado.next();

        Equipo e1 = new Equipo(nombre, universidad, lenguaje);

        System.out.println("Datos de los integrantes del equipo");
        String nombreProgramador;
        String apellidosProgramador;

        for (int i = 0; i < 3; i++) {
            System.out.println("Nombre del integrante: ");
            nombreProgramador = teclado.next();
            Equipo.validarCampo(nombreProgramador);

            System.out.println("Apellidos del integrante: ");
            apellidosProgramador = teclado.next();
            Equipo.validarCampo(apellidosProgramador);

            Programador p1 = new Programador(nombreProgramador, apellidosProgramador);
            e1.añadir(p1);

        }
        teclado.close();
    }
}

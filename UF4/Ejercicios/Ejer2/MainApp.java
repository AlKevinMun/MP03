package UF4.Ejercicios.Ejer2;
import java.util.Date;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        int victorias = 0;
        int derrotas = 0;
        int partidas = 0;
        int option = 100;
        Scanner scanner = new Scanner(System.in);

        while (option != 0) {

            System.out.println("- - - JUEGOS DISPONIBLES - - - ");
            System.out.println("- - - - - 1. PARCHIS - - - - - ");
            System.out.println("- - - - - 2. TIC TAC - - - - - ");
            System.out.println("- - - - - - 3. DADOS - - - - - ");
            System.out.println("- - - 4. VER ESTADISTICAS - - - ");
            System.out.println("- - - - - 0. VOLVER - - - - - ");

            System.out.print("¿Que quieres seleccionar?: ");
            option = scanner.nextInt();
            switch (option) {

                case 1:
                    System.out.println("Work in Progress");
                    break;
                case 2:
                    System.out.println("Work in Progress");
                    break;
                case 3:
                    Dado dado1 = new Dado();
                    Dado dado2 = new Dado();
                    Dado dado3 = new Dado();
                    JuegoDados juegoDados = new JuegoDados(dado1, dado2, dado3);
                    juegoDados.jugar();
                    if (juegoDados.jugar()) {victorias++;partidas++;
                    } else {derrotas++;partidas++;}
                    System.out.println(juegoDados);
                    break;
                case 4:
                    System.out.println("Has ganado un total de " + victorias + " partidas de un total de " + partidas + " jugadas");
                    System.out.println("Has perdido un total de " + derrotas + " partidas de un total de " + partidas + " jugadas");
                    break;
                case 0:
                    break;
            }
        }
    }
}

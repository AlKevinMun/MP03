package UF4.Ejercicios;
import java.util.*;
public class Daus {
    public static void main(String[] args) {
        int dados;
        int resultados[] = new int[11];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas veces quieres tirar los dados: ");
        int tiradas = scanner.nextInt();
        for (int i = 0; i < tiradas ; i++) {
            dados = (int) (Math.random()*6+1 + Math.random()*6+1);
            resultados[dados-2]++;
            /*
            if (dados==2){resultados[0]++;}
            else if (dados==3) {resultados[1]++;}
            else if (dados==4) {resultados[2]++;}
            else if (dados==5) {resultados[3]++;}
            else if (dados==6) {resultados[4]++;}
            else if (dados==7) {resultados[5]++;}
            else if (dados==8) {resultados[6]++;}
            else if (dados==9) {resultados[7]++;}
            else if (dados==10) {resultados[8]++;}
            else if (dados==11) {resultados[9]++;}
            else if (dados==12) {resultados[10]++;}
            */
        }
        for (int i = 1; i <= resultados.length; i++) {
            System.out.println("El numero "+i+" ha salido un total de "+resultados[i-1]+" veces");
        }

    }

}

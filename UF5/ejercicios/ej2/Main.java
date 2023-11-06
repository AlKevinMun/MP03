package UF5.ejercicios.ej2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("UF5/ejercicios/ej2/santako.txt"));

        // CON EXPRESIONES REGULARES

        Pattern palabras = Pattern.compile("(\\*<]:-DOo)|(>:o\\))|(<]:-D)");

        while (scanner.hasNext()){
            String line = scanner.nextLine();
            Matcher matcher = palabras.matcher(line);

            int cSanta = 0;
            int cReno = 0;
            int cElfo = 0;

            while (matcher.find()){

                if (matcher.group(1)!=null)cSanta++;

                if (matcher.group(2)!=null)cReno++;

                if (matcher.group(3)!=null)cElfo++;

            }
            if (cSanta!=0) System.out.print("Pare Noel "+"("+cSanta+") ");
            if (cReno!=0) System.out.print("Ren "+"("+cReno+")");
            if (cElfo!=0) System.out.print("Follet "+"("+cElfo+")");

            System.out.println("");

        }

        // SIN EXPRESIONES REGULARES

        Scanner scanner2 = new Scanner(new File("UF5/ejercicios/ej2/santako.txt"));

        while (scanner2.hasNext()){
            String linea1 = scanner2.nextLine();

            int cSanta2 = 0;
            int cReno2 = 0;
            int cElfo2 = 0;

            //if (){};
        }


    }
}

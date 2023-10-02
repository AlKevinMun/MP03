package UF4.Strings;

import java.util.Date;

public class CastigApp {
    public static void main(String[] args) {
        final String MSG_A_COPIAR = "No tornare a fer servir l'operador '+' per concatenar strings";
        final int NUM_COPIES = 10_000;

        String casting = "";

        Date d1 = new Date();
        StringBuilder sb = new StringBuilder(MSG_A_COPIAR.length() * NUM_COPIES);
        for (int i = 0; i < NUM_COPIES; i++) {
            sb.append(MSG_A_COPIAR);
            //casting += MSG_A_COPIAR;
        }
        sb.toString();
        Date df = new Date();

        System.out.printf("Ha trigat %d milisegonds", df.getTime()- d1.getTime());

    }
}

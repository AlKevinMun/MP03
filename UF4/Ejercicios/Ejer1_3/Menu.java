package UF4.Ejercicios.Ejer1_3;

import java.util.Scanner;


public class Menu {
    private int opcion;
    private int temp;
    private Game g;
    private ConfigGame cg;
    Scanner scanner = new Scanner(System.in);


    public void MostrarMenuPrincipal (){

        System.out.println("1. - Play");
        System.out.println("2. - Settings");
        System.out.println("3. - Exit");

    }
    public void MostrarPartida (){
        System.out.println("Playing...");
        System.out.println(cg.getNumPlayers() + " Players");
        System.out.println("Level: "+cg.getLevel());
        System.out.println("Exit game....");
        opcion=0;
    }
    public void MostrarMenuSettings (){

        System.out.println("1. - Change level (1-5)");
        System.out.println("2. - Change players (1-4)");
        System.out.println("0. - Exit");

    }

    public void EscogerOpcionMenuPrincipal(){
        System.out.println("¿Que quieres hacer?:  ");
        opcion = scanner.nextInt();
        while (opcion != 3){
            switch (opcion){
                case 1:
                    MostrarPartida();
                    System.out.println(" ");
                    break;
                case 2:
                    MostrarMenuSettings();
                    EscogerOpcionMenuSettings();
                    System.out.println(" ");
                    break;
                case 3:
                    break;
            }
            if (opcion!=3){
                MostrarMenuPrincipal();
                EscogerOpcionMenuPrincipal();
                System.out.println(" ");
            }
        }
    }
    public void EscogerValor (){
        System.out.println("¿A que valor quieres cambiar?:  ");
        temp = scanner.nextInt();
    }
    public void EscogerOpcionMenuSettings() {
        System.out.println("¿Que quieres hacer?:  ");
        opcion = scanner.nextInt();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    EscogerValor();
                    cg.setLevel(temp);
                    System.out.println("Level: "+cg.getLevel());
                    System.out.println(" ");
                    break;
                case 2:
                    EscogerValor();
                    cg.setNumPlayers(temp);
                    System.out.println("MaxPlayers: "+cg.getNumPlayers());
                    System.out.println(" ");
                    break;
                case 0:
                    break;
            }
            if (opcion != 0) {
                MostrarMenuSettings();
                EscogerOpcionMenuSettings();
                System.out.println(" ");
            }
        }
    }
    public Menu(Game g, ConfigGame cg) {
        this.g = g;
        this.cg = cg;
    }


}

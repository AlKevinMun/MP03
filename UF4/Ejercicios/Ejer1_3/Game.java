package UF4.Ejercicios.Ejer1_3;

import java.io.ObjectInputFilter;
import java.util.ArrayList;

public class Game {
    ConfigGame configGame = new ConfigGame(1,1);
    ArrayList<Player> playerArrayList = new ArrayList<>();
    Menu menu = new Menu(this,configGame);
    public void start(){
        menu.MostrarMenuPrincipal();
        menu.EscogerOpcionMenuPrincipal();
    }
}

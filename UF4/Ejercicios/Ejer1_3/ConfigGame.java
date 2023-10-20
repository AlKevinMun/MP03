package UF4.Ejercicios.Ejer1_3;

public class ConfigGame {
    private int level;
    private int numPlayers;

    public int getLevel() {return level;}

    public void setLevel(int level) {this.level = level;}

    public int getNumPlayers() {return numPlayers;}

    public void setNumPlayers(int numPlayers) {this.numPlayers = numPlayers;}

    public ConfigGame(int level, int numPlayers) {
        this.level = level;
        this.numPlayers = numPlayers;
    }
}

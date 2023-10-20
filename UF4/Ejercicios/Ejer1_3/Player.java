package UF4.Ejercicios.Ejer1_3;

public class Player {
    private String name;
    private int points;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getPoints() {return points;}

    public void setPoints(int points) {this.points = points;}

    public Player(String name, int points) {
        this.name = name;
        this.points = points;
    }
}

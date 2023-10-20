/*package UF4.Ejercicios.Ejer2;

public class JuegoDados {
    private Dado dado1 = new Dado();
    private Dado dado2 = new Dado();
    private Dado dado3 = new Dado();

    public JuegoDados(Dado dado1, Dado dado2, Dado dado3) {
        this.dado1 = dado1;
        this.dado2 = dado2;
        this.dado3 = dado3;
    }

    @Override
    public String toString() {
        return "JuegoDados{" +
                "dado1=" + dado1 +
                ", dado2=" + dado2 +
                ", dado3=" + dado3 +
                '}';
    }

    public boolean jugar(){
        dado1.tirar();
        dado2.tirar();
        dado3.tirar();

        if (dado1.equals(dado2)){
            if (dado2.equals(dado3)){
                return true;
            }
        }
        return false;
    }
}
 */

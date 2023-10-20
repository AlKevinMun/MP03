//package UF4.Ejercicios.Ejer2;

public class Dado {

    private int valor;

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "valor=" + valor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dado dado = (Dado) o;
        return valor == dado.valor;
    }

    public void tirar(){
        valor=(int)(Math.random()*6+1);
    }
}

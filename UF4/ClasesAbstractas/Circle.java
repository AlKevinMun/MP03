package UF4.ClasesAbstractas;

public class Circle extends Figura {
    private double radi;
    @Override
    public double getArea(){
        return Math.PI * radi * radi;
    }
}

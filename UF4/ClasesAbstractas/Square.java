package UF4.ClasesAbstractas;

public class Square extends Figura {
    private double costat;
    @Override
    public double getArea (){
        return costat*costat;
    }
}

package UF4.Ejercicios.Ejer1_4;

import java.util.Comparator;

public class ComparadorAlumnesCarrec implements Comparator<Alumne> {

    @Override
    public int compare(Alumne alumne, Alumne t1) {
        return      alumne.getCarrec().toString().compareTo(t1.getCarrec().toString());
    }
}

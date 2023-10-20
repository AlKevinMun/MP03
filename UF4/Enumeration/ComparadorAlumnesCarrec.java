package UF4.Enumeration;

import java.util.Comparator;

public class ComparadorAlumnesCarrec implements Comparator<Alumne> {

    @Override
    public int compare(Alumne alumne, Alumne t1) {
        return      alumne.getCarrec().toString().compareTo(t1.getCarrec().toString());
    }
}

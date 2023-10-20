package UF4.Enumeration;

import java.util.*;

public class MainEnums {
    public static void main(String[] args) {
        Alumne alumne = new Alumne("ZAlejandro","1", Alumne.Carrec.DELEGAT);
        Alumne alumne2 = new Alumne("ChinChon","2", Alumne.Carrec.SENSE_CARREC);
        UF mp3uf4 = new UF("1", "Introducion programacion POO");
        UF mp3uf5 = new UF("2", "POO avanzado");

        alumne2.addNota(mp3uf4,Qualifier.EXCELLENT);
        alumne2.addNota(mp3uf5,Qualifier.NOTABLE);
        alumne.addNota(mp3uf4,Qualifier.NO_SATISFACTORI);
        alumne.addNota(mp3uf5,Qualifier.NOTABLE);


        List<Alumne> llistaAlumnes = new ArrayList<>();
        llistaAlumnes.add(alumne);
        llistaAlumnes.add(alumne2);

        llistaAlumnes.forEach(a -> System.out.println(a));
        Collections.sort(llistaAlumnes);
        llistaAlumnes.forEach(a -> System.out.println(a));
        ComparadorAlumnesCarrec c2 = new ComparadorAlumnesCarrec();
        Collections.sort(llistaAlumnes,c2);
        llistaAlumnes.forEach(a -> System.out.println(a));


        for (Qualifier q : Qualifier.values()) {
            System.out.printf("%s %s %d %n", q.name(),q.getCodi(),q.getNota());
        }

        System.out.printf("Notes de %s%n",alumne2.getNombre());

        for (Map.Entry entry: alumne2.getNotes().entrySet()){
            Qualifier qf = (Qualifier) entry.getValue();
            UF uf = (UF) entry.getKey();
            System.out.printf("%s,%s,%n",uf.getNom(),qf.getCodi());
        }
    }
}

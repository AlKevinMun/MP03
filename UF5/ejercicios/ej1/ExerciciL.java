package UF5.ejercicios.ej1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ExerciciL {

    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d/MM/yyy");
        Persona p1 = new Persona("Arya", Persona.Genere.DONA, LocalDate.parse("25/12/2002",format) );
        Persona p2 = new Persona("Tyrion", Persona.Genere.HOME, LocalDate.parse("12/10/1980",format));
        Persona p3 = new Persona("Cersei", Persona.Genere.DONA, LocalDate.parse("10/01/1984",format));
        Persona p4 = new Persona("Eddard", Persona.Genere.HOME, LocalDate.parse("24/04/1974",format));
        Persona p5 = new Persona("Sansa", Persona.Genere.DONA, LocalDate.parse("24/04/1992",format));
        Persona p6 = new Persona("Jaime", Persona.Genere.HOME, LocalDate.parse("24/04/1979",format));
        Persona p7 = new Persona("Khal", Persona.Genere.HOME, LocalDate.parse("10/08/1979",format));
        Persona p8 = new Persona("Daenerys", Persona.Genere.DONA, LocalDate.parse("12/11/1992",format));
        Persona p9 = new Persona("Davos", Persona.Genere.HOME, LocalDate.parse("12/11/1965",format));
        Persona p10 = new Persona("Jon Neu", Persona.Genere.HOME, LocalDate.parse("12/11/1986",format));
        Persona p11 = new Persona("Brienne", Persona.Genere.DONA, LocalDate.parse("12/11/1989",format));

        Persona[] lpers = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11};
        List<Persona> llistaPersones;
        llistaPersones = new ArrayList<>(Arrays.asList(lpers));
        Map<Integer,Integer> mapPersones = new HashMap<>();

        // 1 - Canviar a lambda
        /*Collections.sort(llistaPersones, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                if(o1.getNom().charAt(0) >= o2.getNom().charAt(0)) return 1;
                else return -1;
            }
        });
         */

        llistaPersones.sort((a1,a2) -> {if(a1.getNom().charAt(0) >= a2.getNom().charAt(0)) return 1; else return -1;});

        // 2 - Canviar a Lambda
        /*
        for(Persona p: llistaPersones) {
            System.out.println(p);
        }
        */
        System.out.println("Ordenador por primera letra");
        llistaPersones.forEach(persona -> System.out.println());


        // 3 - Canvia a classe anònima
        // ordenació alfabètica inversa del nom
        //llistaPersones.sort((o1,o2) -> o2.getNom().compareTo(o1.getNom()));

        Collections.sort(llistaPersones, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                if (o2.getNom().equals(o1.getNom())) return 1;
                return -1;
            }
        });

        // 4 - fes servir un reference method en comptes del for-loop
        /*
        for(Persona p: llistaPersones) {
            System.out.println(p);
        };
        */
        System.out.println("Ordenado inverso");
        llistaPersones.forEach(System.out::println);

        // 5 - Omplir map. Canviar el for-llop per un forEach amb lambda
        for(Persona per : llistaPersones) {
            mapPersones.put(per.getAge(),1);
        }

        // 6 - Canvia el for-loop per un recorregut forEach amb lambda
        for(Map.Entry entry : mapPersones.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        /* 7 -
            Esbrina com s'utilitzen i perquè serveixen els mètodes de map següents
                map.putIfAbsent
                map.computeIfAbsent
                map.computeIfPresent

             afegeix al map la freqüència d'edat de les persones, de la llistaPersones

             **Si vols fes-ho primer sense els mètodes anomenats i sense lambdes
             i després amb els mètodes i amb lambdes**

             La sortida és aquesta:
                34 anys -> 1
                38 anys -> 1
                39 anys -> 2
                26 anys -> 2
                44 anys -> 1
                15 anys -> 1

         */

        // STREAMS

        // 8 - llistat de persones DONA amb lambda (stream)

        // 9 - Llistat dels dos HOMES més joves (stream)

        // 10- Esborrar (no filtrar o imprimir) del llistat les persones entre 30 i 40 anys (amb lambda)

        // 11 - Persones que tinguin una 'a' al seu nom

        //12 - Llistat de les dates de naixament + dos dies

        //13 - Rejovenir dos anys a totes les persones

    }


}

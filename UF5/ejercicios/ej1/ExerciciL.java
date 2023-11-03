package UF5.ejercicios.ej1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        System.out.println("---Punto 1 empieza---");

        llistaPersones.sort((a1,a2) -> {if(a1.getNom().charAt(0) >= a2.getNom().charAt(0)) return 1; else return -1;});


        // 2 - Canviar a Lambda
        /*
        for(Persona p: llistaPersones) {
            System.out.println(p);
        }
        */
        System.out.println("---Punto 2 empieza---");
        System.out.println("Ordenador por primera letra");
        llistaPersones.forEach(persona -> System.out.println(persona));


        // 3 - Canvia a classe anònima
        // ordenació alfabètica inversa del nom
        //llistaPersones.sort((o1,o2) -> o2.getNom().compareTo(o1.getNom()));

        System.out.println("---Punto 3 empieza---");
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
        System.out.println("---Punto 4 empieza---");
        System.out.println("Ordenado inverso");
        llistaPersones.forEach(System.out::println);


        // 5 - Omplir map. Canviar el for-llop per un forEach amb lambda
        /*
        for(Persona per : llistaPersones) {
            mapPersones.put(per.getAge(),1);
        }
         */
        System.out.println("---Punto 5 empieza---");

        llistaPersones.forEach(persona -> mapPersones.put(persona.getAge(),1));


        // 6 - Canvia el for-loop per un recorregut forEach amb lambda
        /*
        for(Map.Entry entry : mapPersones.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
         */
        System.out.println("---Punto 6 empieza---");

        mapPersones.entrySet().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));


        /* 7 -
            Esbrina com s'utilitzen i perquè serveixen els mètodes de map següents
                map.putIfAbsent -> Si no esta ponlo
                map.computeIfAbsent -> Procesa/ejecuta si no esta
                map.computeIfPresent -> Procesa/ejecuta si esta

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

        System.out.println("---Punto 7 empieza---");
        mapPersones.clear();
        for (Persona persona : llistaPersones) {
            int edat = persona.getAge();
            mapPersones.computeIfPresent(edat, (key, value) -> value + 1);
            mapPersones.putIfAbsent(edat, 1);
        }

        // Imprimir el mapa con la frecuencia de edades
        for (Map.Entry<Integer, Integer> entry : mapPersones.entrySet()) {
            System.out.println("Edat: " + entry.getKey() + " -> Freqüència: " + entry.getValue());
        }

        // STREAMS

        // 8 - llistat de persones DONA amb lambda (stream)
        System.out.println("---Punto 8 empieza---");
        llistaPersones.stream().filter(persona -> persona.getGenere() == Persona.Genere.DONA).forEach(p -> System.out.println(p));

        // 9 - Llistat dels dos HOMES més joves (stream)
        System.out.println("---Punto 9 empieza---");
        llistaPersones.stream().filter(persona -> persona.getGenere() == Persona.Genere.HOME).sorted((e1, e2) -> e2.getDataNaixament().compareTo(e1.getDataNaixament())).limit(2).forEach(System.out::println);

        // 10- Esborrar (no filtrar o imprimir) del llistat les persones entre 30 i 40 anys (amb lambda)
        System.out.println("---Punto 10 empieza---");
        llistaPersones.removeIf(p -> p.getAge() >=30 && p.getAge() <= 40);

        // 11 - Persones que tinguin una 'a' al seu nom
        System.out.println("---Punto 11 empieza---");
        llistaPersones.stream().filter(p-> p.getNom().contains("a")).forEach(System.out::println);

        //12 - Llistat de les dates de naixament + dos dies
        System.out.println("---Punto 12 empieza---");
        llistaPersones.stream().map(p -> p.getDataNaixament().plusDays(2)).forEach(System.out::println);

        //13 - Rejovenir dos anys a totes les persones
        System.out.println("---Punto 13 empieza---");
        llistaPersones.stream().map(p -> p.getAge()-2).forEach(System.out::println);

        //14. A partir de la següent llista de noms d'alumnes crea una nova llista d'alumnes amb aquests alumnes nous
        // pots modificar la classe alumne si cal. I imprimeix la llista dels nous alumnes
        System.out.println("---Punto 14 empieza---");

        List<String> alumnesNous = Arrays.asList("Pedro","Pablo","Bilma");
        List<Alumne> alumnes2 = alumnesNous.stream().map(Alumne::new).collect(Collectors.toList());
        //Creem cotxes i els assignem a les diferents persones
        Cotxe c1 = new Cotxe("Seat Ibiza");
        Cotxe c2 = new Cotxe("Seat Leon");
        Cotxe c3 = new Cotxe("Seat Arona");
        Cotxe c4 = new Cotxe("Toyota Auris");
        Cotxe c5 = new Cotxe("Toyota Corolla");
        Cotxe c6 = new Cotxe("Toyota Yaris");
        p1.setCotxe(c1); p2.setCotxe(c2);
        p3.setCotxe(c1); p4.setCotxe(c3);
        p5.setCotxe(c4); p6.setCotxe(c4);
        p7.setCotxe(c5); p8.setCotxe(c6);
        p9.setCotxe(c5); p10.setCotxe(c3);
        p11.setCotxe(c2);
        //15. Crear una llista de persones amb el coxes de la marca Seat i una altra
        // amb les persones que tenen un Toyota. Fes servir streams
        // imprimeix les dues llistes per ordenades per l'edat de les persones
        System.out.println("---Punto 15 empieza---");
        List<Persona> seat =  llistaPersones.stream().filter(p -> p.getCotxe().getMarca().contains("Seat")).sorted((o1,o2) -> o2.compareTo(o1)).toList();
        List<Persona> toyota =  llistaPersones.stream().filter(p -> p.getCotxe().getMarca().contains("Toyota")).sorted((o1,o2) -> o2.compareTo(o1)).toList();

        System.out.println("\n15 - Persones amb Seat i Toyota");

        seat.forEach(System.out::println);
        System.out.println("--- Separacion marca ---");
        toyota.forEach(System.out::println);

        //16. Imprimeix les persones ordenades per ordre alfabètic de la marca dels cotxes
        System.out.println("---Punto 16 empieza---");


        System.out.println("\n16 - Persones ordenades per ordre alfabètic de la marca dels cotxes");

        llistaPersones.stream().sorted((o1,o2) -> o1.getCotxe().getMarca().compareTo(o2.getCotxe().getMarca())).forEach(System.out::println);

    }


}

package UF4.Ejercicios.Ejer1_4;

import UF4.Enumeration.Alumne;
import UF4.Enumeration.Qualifier;
import UF4.Enumeration.UF;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // punt 2
        List<Llapis> caixaLlapis1 = new ArrayList<>();
        List<Llapis> caixaLlapis2 = new ArrayList<>();
        // punt 3 i 4
        for (int i = 0; i < 10; i++) {
            caixaLlapis1.add(new Llapis((int)(Math.random()*8)));
            caixaLlapis2.add(new Llapis((int)(Math.random()*8),(float) (Math.random()*3)));
        }
        // punt 5
        System.out.println("----------Bucle For----------");
        System.out.println("Llapices de la caixa 1");
        System.out.println("");
        for (int i = 0; i < caixaLlapis1.size(); i++) {
            System.out.println(caixaLlapis1.get(i).toString());
        }
        System.out.println("");
        System.out.println("Llapices de la caixa 2");
        System.out.println("");
        for (int i = 0; i < caixaLlapis1.size(); i++) {
            System.out.println(caixaLlapis2.get(i).toString());
        }

        System.out.println("----------Bucle For Loop----------");
        System.out.println("Llapices de la caixa 1");
        System.out.println("");
        for(Llapis c1 : caixaLlapis1){
            System.out.println(c1.toString());
        }
        System.out.println("");
        System.out.println("Llapices de la caixa 2");
        System.out.println("");
        for(Llapis c2 : caixaLlapis2){
            System.out.println(c2.toString());
        }
        System.out.println("----------Bucle For Each----------");
        System.out.println("Llapices de la caixa 1");
        System.out.println("");
        caixaLlapis1.forEach(System.out::println);
        System.out.println("");
        System.out.println("Llapices de la caixa 2");
        System.out.println("");
        caixaLlapis2.forEach(System.out::println);
        System.out.println("----------Bucle iterator----------");
        Iterator<Llapis> c1 = caixaLlapis1.iterator();
        Iterator<Llapis> c2 = caixaLlapis2.iterator();
        System.out.println("Llapices de la caixa 1");
        System.out.println("");
        while (c1.hasNext()){
            System.out.println(c1.next());
        }
        System.out.println("");
        System.out.println("Llapices de la caixa 2");
        System.out.println("");
        while (c2.hasNext()){
            System.out.println(c2.next());
        }

        //punt 6
        System.out.println("Caixa 1 ordenada");
        caixaLlapis1.sort(new Comparator<Llapis>() {
            @Override
            public int compare(Llapis o1, Llapis o2) {
                return Integer.compare(o1.getColor(),o2.getColor());
            }
        });
        caixaLlapis1.forEach(System.out::println);
        //punt 7
        System.out.println("Caixa 2 ordenada");
        caixaLlapis2.sort(new Comparator<Llapis>() {
            @Override
            public int compare(Llapis o1, Llapis o2) {
                return Float.compare(o1.getGruix(),o2.getGruix());
            }
        });
        caixaLlapis2.forEach(System.out::println);
        // punt 8 y 9
        List<Llapis> totes = new ArrayList<>();
        totes.addAll(caixaLlapis2);

        totes.addAll(caixaLlapis1);

        //punt 10
        System.out.println("Totes les caixes en una llista");
        totes.forEach(System.out::println);
        //punt 11
        Set<Llapis> hashLlapis = new HashSet<>(totes);
        List<Llapis> totesNoRepetit = new ArrayList<>(hashLlapis);
        System.out.println(" ");
        System.out.println("Llista sense repetir");
        totesNoRepetit.forEach(System.out::println);
        System.out.println(" ");
        //punt 12

        Map<Integer,String> map_colors = new HashMap<>();
        //Afegim entrades al map
        map_colors.put(0,"Negre");
        map_colors.put(1,"Vermell");
        map_colors.put(2,"Groc");
        map_colors.put(3,"Verd");
        map_colors.put(4,"Verd");
        map_colors.put(3,"Blanc");
        // Explica què passa amb el color verd i amb la clau 3. Perquè?
        // Lo que ocurre es que tiene en cuenta el valor de la ultima clave 3. Esto ocurre porque el codigo funciona de forma sequencial, es decir, de arriba abajo.

        //Printra tot el hashmap
        System.out.println("Tot el contingut del map");
        for(Map.Entry entry : map_colors.entrySet()){
            System.out.println(entry);
        }
        System.out.println("Solament els valorts");
        // printa solament els valors
        for(Map.Entry entry : map_colors.entrySet()){
            System.out.println(entry.getValue());
        }

        //punt 13

        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        List<Integer> dadoList = new ArrayList<>();
        dadoList.add(dado1.getValor());
        dadoList.add(dado2.getValor());
        System.out.println(" ");
        for (int i = 0; i < 50; i++) {
            dado1.tirar();
            dado2.tirar();
            dadoList.add(dado1.getValor()+ dado2.getValor());
        }
        for (int i = 2; i <= 12; i++) {
            System.out.println(i+": "+Collections.frequency(dadoList,i));
        }

        //punt 14

        System.out.println("");
        System.out.println("Hasmap");
        Map<Integer,Integer> mapadados = new HashMap<>();
        for (int i = 2; i <= 12; i++) {
            mapadados.put(i,0);
        }
        for (int i = 0; i < 50; i++) {
            dado1.tirar();
            dado2.tirar();
            if (mapadados.containsKey(dado1.getValor()+dado2.getValor())){
                mapadados.replace(dado1.getValor()+dado2.getValor(),mapadados.get(dado1.getValor()+dado2.getValor())+1);
            }
        }
        for (int i = 2; i <=  12; i++) {
            System.out.println(i+": "+mapadados.get(i));
        }

        // punt 15

        System.out.println("");
        System.out.println("Lista de alumnos");
        UF4.Enumeration.Alumne alumne = new UF4.Enumeration.Alumne("Alejandro","1", UF4.Enumeration.Alumne.Carrec.DELEGAT);
        UF4.Enumeration.Alumne alumne2 = new UF4.Enumeration.Alumne("Rusben","2", Alumne.Carrec.SENSE_CARREC);
        UF4.Enumeration.Alumne alumne3 = new UF4.Enumeration.Alumne("ChinChon","3", Alumne.Carrec.SUBDELEGAT);
        UF4.Enumeration.UF mp3uf4 = new UF("1", "Introducion programacion POO");
        UF mp3uf5 = new UF("2", "POO avanzado");
        UF mp3uf6 = new UF("3", "POO profesional");

        alumne.addNota(mp3uf5, Qualifier.NOTABLE);
        alumne.addNota(mp3uf6, Qualifier.SATISFACTORI);
        alumne.addNota(mp3uf4, Qualifier.NO_SATISFACTORI);

        alumne2.addNota(mp3uf4, Qualifier.EXCELLENT);
        alumne2.addNota(mp3uf6, Qualifier.SATISFACTORI);
        alumne2.addNota(mp3uf5, Qualifier.NO_SATISFACTORI);

        alumne3.addNota(mp3uf6, Qualifier.NOTABLE);
        alumne3.addNota(mp3uf5, Qualifier.SATISFACTORI);
        alumne3.addNota(mp3uf4, Qualifier.NO_SATISFACTORI);

        List<Alumne> llistaAlumnes = new ArrayList<>();
        llistaAlumnes.add(alumne);
        llistaAlumnes.add(alumne2);
        llistaAlumnes.add(alumne3);

        for (Alumne a1: llistaAlumnes) {
            System.out.println("Alumno "+a1.getNombre());
            System.out.println("mp3uf4: " +a1.getNotes().get(mp3uf4));
            System.out.println("mp3uf5: " +a1.getNotes().get(mp3uf5));
            System.out.println("mp3uf6: " + a1.getNotes().get(mp3uf6));
            System.out.println("");
        }
        Collections.sort(llistaAlumnes);
        System.out.println("Llista ordenada:");
        for (Alumne a1: llistaAlumnes){
            System.out.println("Alumno "+a1.getNombre());
            System.out.printf("Nota media: %.2f",(a1.getNotes().get(mp3uf4).getNota()+a1.getNotes().get(mp3uf5).getNota()+a1.getNotes().get(mp3uf6).getNota())/3f);
            System.out.println("");
        }

    }
}

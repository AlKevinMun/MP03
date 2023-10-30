package UF5.lamba;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Alumne implements Comparable<Alumne> {
    private LocalDate dataNaixament;
    private String nom;

    public Alumne(LocalDate dataNaixament, String nom) {
        this.dataNaixament = dataNaixament;
        this.nom = nom;
    }

    public LocalDate getDataNaixament() {return dataNaixament;}

    public void setDataNaixament(LocalDate dataNaixament) {this.dataNaixament = dataNaixament;}

    public String getNom() {return nom;}

    public void setNom(String nom) {this.nom = nom;}

    @Override
    public String toString() {
        return "Alumne{" +
                "dataNaixament=" + dataNaixament +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    public int compareTo(Alumne o) {
        if (dataNaixament.isBefore(o.getDataNaixament())) return -1;
        else if (dataNaixament.isAfter(o.getDataNaixament())) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Alumne alumne1 = new Alumne(LocalDate.of(2003,11,12),"Kevin");
        Alumne alumne2 = new Alumne(LocalDate.of(2000,4,30),"Pepe");
        Alumne alumne3 = new Alumne(LocalDate.of(1999,12,25),"Robert");

        List<Alumne> alumneList = Arrays.asList(alumne1,alumne2,alumne3);

        alumneList.forEach(new Consumer<Alumne>() {
            @Override
            public void accept(Alumne alumne) {
                System.out.println(alumne);
            }
        });
        System.out.println();

        alumneList.forEach(alumne -> System.out.println(alumne)); // Lambda

        System.out.println();

        alumneList.forEach(System.out::println); // Metodo unico

        System.out.println();

        Collections.sort(alumneList);
        alumneList.forEach(alumne -> System.out.println(alumne));
        System.out.println();
        alumneList.forEach(new Consumer<Alumne>() {
            @Override
            public void accept(Alumne alumne) {
                System.out.println(alumne);
            }
        });

        System.out.println("Ordenadors por nombre");

        alumneList.sort((a1, a2) -> a1.getNom().compareTo(a2.getNom()));
        alumneList.forEach(System.out::println); // Metodo unico

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hola soy un proceso");
            }
        };

        Runnable r2 = () -> System.out.println("Hola soy un proceso r2");
        Thread t = new Thread(r2);
        t.start();

        //Runnable r3 = () -> System.out.println("Hola soy un proceso r2");
        Thread t2 = new Thread(() -> System.out.println("Hola soy un proceso r3"));
        t2.start();

        //STREAMS
        System.out.println();
        List<Alumne> la = alumneList.stream().filter(alumne -> alumne.getDataNaixament().getYear()<2000).collect(Collectors.toList());
        //if (op.isPresent()) System.out.println(op.get());
        la.forEach(System.out::println);


    }
}

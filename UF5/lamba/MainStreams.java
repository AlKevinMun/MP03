package UF5.lamba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainStreams {
    public static void main(String[] args) {

        //Formas de crear un Stream

        Stream<String> stream1 = Stream.of("Alejandro","Kevin","Miguel","Rubén","ChinChong","RRR","Pep");

        String llistaN[] = new String[]{"Alejandro","Kevin","Miguel","Rubén","ChinChong"};
        Stream<String> stream2 = Arrays.stream(llistaN);

        List<String> llistaN2 = Arrays.asList(llistaN);
        Stream<String> stream3 = llistaN2.stream();

        // Uso de los streams sin lambdas

        stream1.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 4;
            }
        }).map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println();

        //Uso de Stream con Lambdas

        stream2.filter(s -> s.length() > 4).map(s -> s.toUpperCase()).sorted((o1,o2) -> Integer.compare(o1.length(),o2.length())).forEach(System.out::println);

        System.out.println();

        stream3.filter(s -> s.length() > 4).map(String::toUpperCase).sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);


    }
}

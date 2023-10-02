package UF4.Strings;

public class StringImmutable {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("jose");
        String s= "abc";

        s = s.concat("def");
        s += "ghi";
        s = s.replace('a','z');

        String s1 = new String("java"); //#|
        String s2 = new String("java"); //#2
        System.out.println(s1 == s2); // false

        String s3 = "java"; //#3
        String s4 = "java"; //#4
        System.out.println(s3 == s4); // true

        String s5 = "JDK"; //#5
        String s6 = new String("JDK"); //#6
        System.out.println(s5 == s6); // false

        // El #1 y el #2 dan false debido a que cada uno crea un nuevo objeto, y la compracion es para comparar si son el mismo objeto.

    }
}

package UF5.funcional_interface;

@FunctionalInterface
public interface Test {
    boolean test(int a); // Metodo abstracto

    default int test2 (String a){
        return 0;
    }

    static void doSomething(){
        System.out.println("Hello");
    }

}

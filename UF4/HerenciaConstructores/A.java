package UF4.HerenciaConstructores;

public class A {
    private int num;
    public A (){
        System.out.println("Soy A" + num);
    }
    public A(int n){
        num = n;
        System.out.println("Soy A" + num);
    }
}

class Main{
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A(5);
    }
}

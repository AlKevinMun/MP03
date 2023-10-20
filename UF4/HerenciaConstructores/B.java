package UF4.HerenciaConstructores;

public class B {
    public  B(int n){
        System.out.println("Soy B:"+n);
    }
}
class B2 extends B{

    public B2(int n, int n2) {
        super(n);
        System.out.println("Soy B:" + n + " B2:" +n2);
    }
}
class Main2{
    public static void main(String[] args) {
        B b = new B(3);
        B2 b2 = new B2(5,7);

    }
}

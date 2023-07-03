package AbstractExample;
abstract class AB{
    abstract void A();
}
class B extends AB {

    @Override
    void A() {
        System.out.println("Sameeer");
    }
}
public class Example1 {
    public static void main(String[] args) {
        B b=new B();
        b.A();
    }
}

package AbstractExample;
abstract class Animal{
    abstract void cat();
    abstract void dog();
}class pet extends Animal{

    @Override
    void cat() {
        System.out.println("cat is a pet");
    }

    @Override
    void dog() {
        System.out.println("dog is a pet");
    }
}
public class Example2 {
    public static void main(String args[]){
        pet P=new pet();
        P.cat();
        P.dog();
    }
}

package AbstractExample;
abstract class Matches {

    void Cricket(){
        System.out.println("In india we have lots of cricket matches");
    }
}
abstract class Teams extends Matches{

    abstract void Football();

}


public class Example7 extends Teams{
    public static void main(String[] args) {
        Example7 E=new Example7();
        E.Football();
        E.Cricket();
    }
    @Override
    void Football() {

    }
}

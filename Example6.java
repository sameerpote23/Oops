package AbstractExample;
abstract class Planes{
abstract void jet();
}
abstract class Paperplanes extends Planes{
    abstract void halicapter();

}
public class Example6 extends Paperplanes {
    public static void main(String[] args) {
        Example6 Es =new Example6();
        Es.halicapter();
        Es.jet();
    }
    @Override
    void jet() {
        System.out.println("its use in army ");
    }

    @Override
    void halicapter() {
        System.out.println("its use in a personal use and army use");
    }
}

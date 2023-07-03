package AbstractExample;

abstract class Map{
    abstract void PaperMap();
    abstract void ElectricMap();

}
class Maps extends Map{

    @Override
    void PaperMap() {
        System.out.println(" In old era we use paper maps");
    }

    @Override
    void ElectricMap() {
        System.out.println("In new era we use electronic maps");
    }
}
public class Example5 {
    public static void main(String[] args) {
        Map M = new Maps();

        M.ElectricMap();
        M.PaperMap();
    }
}

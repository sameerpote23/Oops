package AbstractExample;
abstract class marrige{
    abstract void man();
    abstract void woman();
}
class marride extends marrige{

    @Override
    void man() {
        System.out.println("man marride a woman ");
    }

    @Override
    void woman() {
        System.out.println("woman marride to man");
    }
}
public class Example3 {
    public static void main(String[] args) {
        marride M = new marride();
        M.man();
        M.woman();
    }
}

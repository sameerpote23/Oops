package AbstractExample;
abstract class KT{
    abstract void CompanyKT();
}
public class Example10 extends KT{
    public static void main(String[] args) {
Example10 EW=new Example10();
EW.CompanyKT();
    }

    @Override
    void CompanyKT() {
        System.out.println("we use KT to use compny working details");
    }
}

package AbstractExample;
abstract class challege{
    void show(){
        System.out.println("XYz " +
                "dddjd");
    }
    abstract void run();
}
public class Example9 extends challege{

    public static void main(String[] args) {
        Example9 EA=new Example9();
        EA.run();
        EA.show();
    }

    @Override
    void run() {
        System.out.println("SA");

    }
}

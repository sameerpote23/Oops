package AbstractExample;
abstract class Metal{
    void gold(){
        System.out.println("Gold is use for jewllerry");
    }
}
public class Example8 extends Metal{
    public static void main(String[] args) {
        Example8 AS=new Example8();
        AS.gold();
    }
}

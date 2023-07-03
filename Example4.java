package AbstractExample;
   abstract class Mail {
      abstract void Post();
      void electronic(){
          System.out.println("we use electriniuc mil");
      }
   }
 class speedmail extends Mail {

     void Post() {
         System.out.println("We use postman to send a mail ");

     }
 }
public class Example4 {
    public static void main(String arg[]){

        speedmail S = new speedmail();
        S.Post();
        S.electronic();
    }
}

package EncapsulationExample;
class Encapsulation1{
    public String getFirstName() {
        return FirstName;
    }

    public String setFirstName(String firstName) {
        FirstName = firstName;
        return FirstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public String setLastname(String lastname) {
        Lastname = lastname;
        return Lastname;
    }

    private String FirstName;
    private String Lastname;
}
public class Example1 {
    public static void main(String[] args) {
        Encapsulation1 E1=new Encapsulation1();
        E1.getFirstName();
        System.out.println(E1.setFirstName("First name : Sameer"));
        E1.getLastname();
        System.out.println(E1.setLastname("Last name : Pote"));
    }
}

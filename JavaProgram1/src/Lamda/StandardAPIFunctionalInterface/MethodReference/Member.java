package Lamda.StandardAPIFunctionalInterface.MethodReference;

public class Member {
    private String name, id;

    public Member(){System.out.println("Execute Member()");}
    public Member(String id){System.out.println("Execute Member(String id)"); this.id = id;}
    public Member(String name, String id){System.out.println("Execute Member(String name, String id)"); this.name = name; this.id = id;}

    public String getID(){return id;}
}

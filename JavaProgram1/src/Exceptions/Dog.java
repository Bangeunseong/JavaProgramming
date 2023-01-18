package Exceptions;

public class Dog extends Animal {
    String name;
    Dog(String kind, String name){super(kind); this.name = name;}
    public void getInfo(){System.out.println("Kind: " + kind + "\nName: " + name);}
}

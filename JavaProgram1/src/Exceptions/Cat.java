package Exceptions;

public class Cat extends Animal{
    String name;
    Cat(String kind, String name){super(kind); this.name = name;}
    void getInfo(){System.out.println("Kind: " + kind + "\nName: " + name);}
}

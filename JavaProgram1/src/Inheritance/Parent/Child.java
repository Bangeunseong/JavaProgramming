package Inheritance.Parent;

public class Child extends Parent {
    private String name;

    public Child(){this("Unknown");}
    public Child(String name){this.name = name;}

    public String getChileName(){return name;}
}

package Inheritance.Animal;

public abstract class Animal {
    public String kind;

    public void Breathe(){
        System.out.println("Breathing!");
    }

    public abstract void sound();
}

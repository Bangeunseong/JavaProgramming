package Generic.WildCardType;

public class Person {
    //Field
    private String name;
    private String ID;

    //Constructor
    Person(String name, String ID){this.name = name; this.ID = ID;}

    //Method
    public String getName(){return name;}
    public String getID(){return ID;}
    public void setPerson(String name, String ID){this.name = name; this.ID = ID;}

    @Override
    public String toString(){return name;}
}

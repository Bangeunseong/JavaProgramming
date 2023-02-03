package Generic.WildCardType;

public class Student extends Person {
    //Field
    private int S_ID;

    //Constructor
    Student(Person p, int S_ID){super(p.getName(), p.getID()); this.S_ID = S_ID;}
    Student(String name, String ID, int S_ID){super(name, ID); this.S_ID = S_ID;}

    //Method
    public int getS_ID(){return S_ID;}
    public void setS_ID(int S_ID){this.S_ID = S_ID;}
    
    @Override
    public String toString(){return this.getName();}
}

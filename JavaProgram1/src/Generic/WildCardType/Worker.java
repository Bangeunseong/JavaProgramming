package Generic.WildCardType;

public class Worker extends Person {
    //Field
    private int W_ID;
    
    //Constructor
    Worker(Person p, int W_ID){super(p.getName(), p.getID()); this.W_ID = W_ID;}
    Worker(String name, String ID, int W_ID){super(name, ID); this.W_ID = W_ID;}

    //Method
    public void setW_ID(int W_ID){this.W_ID = W_ID;}
    public int getW_ID(){return W_ID;}

    @Override
    public String toString(){return this.getName();}
}

package Generic.WildCardType;

public class HighStudent extends Student {
    //Field
    private boolean Authority;

    //Constructor
    HighStudent(Student s, boolean Authority){
        super(s.getName(), s.getID(), s.getS_ID()); this.Authority = Authority;
    }
    HighStudent(String name, String ID, int S_ID, boolean Authority){
        super(name, ID, S_ID); this.Authority = Authority;
    }

    //Method
    public void setAuthority(boolean Authority){this.Authority = Authority;}
    public boolean getAuthority(){return Authority;}

    @Override
    public String toString(){return this.getName();}
}

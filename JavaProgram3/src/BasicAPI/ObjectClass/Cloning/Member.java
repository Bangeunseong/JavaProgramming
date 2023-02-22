package BasicAPI.ObjectClass.Cloning;

public class Member implements Cloneable {
    //Field
    private String id, password, name;
    private int age; private boolean adult;

    //Constructor
    public Member(String id, String password, String name, int age, boolean adult){
        this.id = id; this.password = password; this.name = name;
        this.age = age; this.adult = adult;
    }

    //Method
    public Member getMember(){
        Member cloned = null;
        try{cloned = (Member)clone();}
        catch(CloneNotSupportedException e){}
        return cloned;
    }
    public String getID(){return id;}
    public String getPassword(){return password;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public boolean getAdult(){return adult;}
}

package Class.Member;

public class Member {
    //Field
    private String name, id, password;
    private int age;

    //Constructor
    Member(){name = id = password = "Unknown"; age = 0;}
    Member(String name, int age, String id, String password){
        this.name = name; this.id = id; this.password = password; this.age = age;
    }

    //Method
    void setMember(String name, String id, String password, int age){
        this.name = name; this.id = id; this.password = password; this.age = age;
    }
    
    @Override
    public int hashCode(){return id.hashCode();}

    String getname(){return name;}
    int getage(){return age;}
    boolean compareID(String id){if(this.id.equals(id)) return true; return false;}
    boolean comparePassword(String password){if(this.password.equals(password)) return true; return false;}
}

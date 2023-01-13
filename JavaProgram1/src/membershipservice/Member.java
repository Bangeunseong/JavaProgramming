package membershipservice;

public class Member {
    protected String name; protected int age;
    protected String id; protected int LoginStatus;
    private String password;

    public Member() {name = "Unknown"; age = 0; id = "Unknown"; password = "Unknown";}
    public Member(String name, String id, String password){this.name = name; this.id = id; this.password = password;}
    public Member(String name, int age, String id, String password){this.name = name; this.age = age; this.id = id; this.password = password;}

    protected void SetPassword(String password){this.password = password;}
    protected String GetPassword(){return password;}
}

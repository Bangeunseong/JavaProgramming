package Lambda.MethodReference;

public class Member {
    private String name, id;

    public Member(){}
    public Member(String id){this.id = id;}
    public Member(String name, String id){this.id = id; this.name = name;}

    public String getID(){return id;}
    public String getName(){return name;}
}

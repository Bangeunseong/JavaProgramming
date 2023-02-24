package Lambda.DefaultMethod.Function;

public class Member {
    private String name, id;
    private Address address;

    public Member(String name, String id, Address address){
        this.name = name; this.id = id; this.address = address;
    }

    public String getName(){return name;}
    public String getID(){return id;}
    public Address getAddress(){return address;}
}

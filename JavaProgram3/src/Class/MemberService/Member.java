package Class.MemberService;

public class Member implements Comparable<Member> {
    //Field
    private String name, ID, Password;

    //Constructor
    public Member(String name, String ID, String Password){
        this.name = name; this.ID = ID; this.Password = Password;
    }

    //Method
    public String getName(){return name;}
    @Override
    public int hashCode(){return ID.hashCode() + Password.hashCode();}
    @Override
    public boolean equals(Object obj){
        if(obj.hashCode() == this.hashCode()) return true;
        return false;
    }
    @Override
    public int compareTo(Member member){
        if(getName().compareToIgnoreCase(member.getName()) < 0) return -1;
        else if(getName().compareToIgnoreCase(member.getName()) == 0) return 0;
        else return 1;
    }
}

package CollectionFramework.Set;

public class Member {
    private String name;
    private int age;

    public Member(String name, int age){this.name = name; this.age = age;}

    public String getName(){return name;}
    public int getAge(){return age;}

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member){
            Member member = (Member)obj;
            return member.getName().equals(name) & member.getAge() == age;
        }
        return false;
    }
    @Override
    public int hashCode(){return name.hashCode() + age;}
}

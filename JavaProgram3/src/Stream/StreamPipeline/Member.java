package Stream.StreamPipeline;

public class Member {
    public static int MALE = 0, FEMALE = 1;

    private String name;
    private int sex, age;

    public Member(String name, int sex, int age){
        this.name = name; this.sex = sex; this.age = age;
    }

    public String getName(){return name;}
    public int getSex(){return sex;}
    public int getAge(){return age;}
}

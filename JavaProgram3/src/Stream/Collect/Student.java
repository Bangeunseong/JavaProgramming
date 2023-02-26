package Stream.Collect;

public class Student implements Comparable<Student> {
    public enum Sex {MALE,FEMALE};
    public enum City {Seoul,Busan};

    //Field
    private String name; private int score;
    private Sex sex; private City city;

    //Constructor
    public Student(String name, int score, Sex sex){
        this.name = name; this.score = score; this.sex = sex;
    }
    public Student(String name, int score, Sex sex, City city){
        this.name = name; this.score = score;
        this.sex = sex; this.city = city;
    }

    //Method
    public String getName(){return name;}
    public int getScore(){return score;}
    public Sex getSex(){return sex;}
    public City getCity(){return city;}

    @Override
    public int hashCode(){
        return sex.hashCode() + name.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            if(this.hashCode() == obj.hashCode()) return true;
        }
        return false;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}

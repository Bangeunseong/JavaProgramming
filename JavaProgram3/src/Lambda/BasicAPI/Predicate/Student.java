package Lambda.BasicAPI.Predicate;

public class Student {
    private String name, sex;
    private int score;
    
    public Student(String name, String sex, int score){
        this.name = name; this.sex = sex; this.score = score;
    }

    public String getSex(){return sex;}
    public String getName(){return name;}
    public int getScore(){return score;}
}

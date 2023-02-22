package Lambda.BasicAPI.Function;

public class Student{
    private String name;
    private int englishScore, mathScore;

    public Student(String name, int englishScore, int mathScore){
        this.name = name; this.englishScore = englishScore; this.mathScore = mathScore;
    }

    public String getName(){return name;}
    public int getEnglishScore(){return englishScore;}
    public int getMathScore(){return mathScore;}
}
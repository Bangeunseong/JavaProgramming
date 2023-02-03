package Lamda.StandardAPIFunctionalInterface;

public class Student {
    private String name;
    private int englishScore, mathScore;
    private String gender;

    public Student(String name, String gender, int englishScore, int mathScore){
        this.name = name; this.englishScore = englishScore; this.mathScore = mathScore; this.gender = gender;
    }

    public String getName(){return name;}
    public String getGender(){return gender;}
    public int getenglishScore(){return englishScore;}
    public int getmathScore(){return mathScore;}
}

package Basics;
public class OperatorExercise {
    public static void StudentGrade(int score){
        String result = (!(score > 90) ? "가" : "나");
        System.out.println(result); //print "가"
    }
    public static void PencilPerStudent(int pencils, int students){
        System.out.println("Pencils per student = " + pencils / students);
        System.out.println("Leftover pencils = " + pencils % students);
    }
    public static double CalculateOddSquare(int lengthtop, int lengthbottom, int height){
        return (double)(lengthtop + lengthbottom) * height / 2;
    }
    public static void main(String[] args){
        //Student Grade
        int score = 85;
        StudentGrade(score);

        //PencilPerStudent
        int pencils = 534;
        int students = 30;
        PencilPerStudent(pencils, students);

        //OddSquare
        int lengthtop = 5, lengthbottom = 10, height = 7;
        System.out.println("Square Area = " + CalculateOddSquare(lengthtop, lengthbottom, height));
    }
}

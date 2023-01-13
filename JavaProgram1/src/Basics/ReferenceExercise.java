package Basics;
import java.util.Scanner;
public class ReferenceExercise {
    public static int FindMaxVal(int[] array){
        int max = -100000000;
        for(int val : array) if(max < val) max = val;
        return max;
    }
    public static int ReturnSum(int[] array){
        int sum = 0;
        for(int val : array) sum += val;
        return sum;
    }
    public static void InvalidateStudentList(int[] scores){
        boolean run = true;
        int studentNum = 0;
        if(scores != null) studentNum = scores.length;
        Scanner scan = new Scanner(System.in);

        while(run){
            System.out.println("---------------------------------------------------------------");
            System.out.println("1.StudentCnt | 2.Input Score | 3.ScoreList | 4.Analyze | 5.Exit");
            System.out.println("---------------------------------------------------------------");
            System.out.print("Choose > ");

            int n = scan.nextInt();

            switch(n){
                case 1:
                System.out.print("How many students? > "); studentNum = scan.nextInt(); scores = new int[studentNum]; break;
                case 2:
                if(studentNum == 0) break;
                for(int i = 0; i < studentNum; i++){System.out.print("Scores[" + i + "] > "); scores[i] = scan.nextInt();} break;
                case 3:
                for(int i = 0; i < studentNum; i++){System.out.println("Scores[" + i + "] : " + scores[i]);} break;
                case 4:
                System.out.println("Highest Score : " + FindMaxVal(scores));
                System.out.println("Average Score : " + (double)ReturnSum(scores) / studentNum); break;
                case 5: run = false; break;
            }
        }
        scan.close();
        return;
    }
    public static void main(String[] args){
        //Find MaxValue in array
        int[] array = {1,5,3,8,2};
        System.out.println("Max : " + FindMaxVal(array));

        //Get Average of array and Summation
        int[][] Array_2D = {{95,86},{83,92,96},{78,83,93,87,88}};
        int sum = 0; int cnt = 0;
        for(int[] array_y : Array_2D){
            for(int val : array_y) {sum += val; cnt++;}
        }
        System.out.println("Sum = " + sum);
        System.out.println("Avg = " + (double)sum / cnt);

        //Get StudentScoreList
        int[] scores = null;
        InvalidateStudentList(scores);
    }
}

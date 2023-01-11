import java.util.Scanner;

public class ConditionsLoops {
    public static String CalculateGrade(int score){
        String Grade;
        if(score >= 90){
            if(score >= 95) Grade = "A+";
            else Grade = "A"; 
        }
        else if(score >= 80){
            if(score >= 85) Grade = "B+";
            else Grade = "B";
        }
        else if(score >= 70){
            if(score >= 75) Grade = "C+";
            else Grade = "C";
        }
        else if(score >= 60) Grade = "D";
        else Grade = "F";
        return Grade;
    }
    public static void PrintGrade(String Grade){
        switch(Grade){
            case "A+":
            case "A":
            System.out.println("Vip Customer"); break;
            case "B+":
            case "B":
            System.out.println("Excellent Customer"); break;
            case "C+":
            case "C":
            System.out.println("Normal Customer"); break;
            default: System.out.println("Guest"); break;
        }
    }
    public static int SumofInteger(int n){
        int sum = 0;
        for(int i = 1;i <= n;i++) sum += i;
        return sum;
    }
    public static void KeyBoardInput() throws Exception{
        boolean run = true;
        int speed = 0, keycode = 0;
        while(run){
            if(keycode != 10 & keycode != 13){
                System.out.println("--------------------------------");
                System.out.println("1.Increase | 2.Decrease | 3.Stop");
                System.out.println("--------------------------------");
                System.out.print("Choose: ");
            }
            keycode = System.in.read();

            if(keycode == '1'){
                System.out.println("Current Speed = " + (++speed));
            }
            else if(keycode == '2'){
                System.out.println("Current Speed = " + (--speed));
            }
            else if(keycode == '3'){
                run = false;
            }
        }
        System.out.println("Procedure Eliminated");
    }
    public static void StringScanner(){
        System.out.println("Type messege");
        System.out.println("To exit Procedure type \"q\"");

        Scanner scan = new Scanner(System.in);
        String input;

        do{
            System.out.print(">");
            input = scan.nextLine();
            System.out.println(input);
        }while(!input.equals("q"));

        System.out.println();
        System.out.println("Procedure Eliminated");
    }
    public static void BreakPhrasePractice1(){
        while(true){
            int num = (int)(Math.random()*6) + 1;
            System.out.println(num);
            if(num == 6) break;
        }
        System.out.println("Procedure Eliminated");
    }
    public static void BreakPhrasePractice2(){
        Outter : for(char upper = 'A';upper<='Z';upper++){
            for(char lower = 'a';lower<='z';lower++){
                System.out.println(upper + "-" + lower);
                if(lower == 'g') break Outter;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        //Random Dice Number
        int n_Random1 = (int)(Math.random()*6) + 1;
        System.out.println("Dice Number = " + n_Random1);

        //Calculating Grade by score
        int score = (int)(Math.random()*101);
        System.out.println("Score : " + score);

        //By using if Phrase Calculated Grade
        String Grade;
        Grade = CalculateGrade(score);
        //By using switch Phrase Calculated Customer Grade
        PrintGrade(Grade);

        //Loop Practice
        //Used for Phrase(SumofInteger function)
        int n_Random2 = (int)(Math.random()*101);
        System.out.println("Sum 1 to " + n_Random2 + " = " + SumofInteger(n_Random2));

        //Used while Phrase
        //KeyBoardInput();

        //Used do-while Phrase
        //StringScanner();

        //break Phrase
        //BreakPhrasePractice1();
        //BreakPhrasePractice2();


    }
}
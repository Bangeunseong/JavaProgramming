import java.util.Scanner;
public class ConditionsLoopsExercise {
    public static int SumofMultipleofN(int N){
        int sum = 0;
        for(int i = 1;i<=100;i++){
            if(i%N == 0) sum += i;
        }
        return sum;
    }
    public static void GetPossibleOutput(){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                if(4*i + 5*j == 60) System.out.println("(" + i + ", " + j + ")");
            }
        }
    }
    public static void PrintTriangle(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++) System.out.print('*');
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception{
        //SumofMultipleofN
        /*
        System.out.print("Input > ");
        Scanner scan = new Scanner(System.in);
        int N = Integer.valueOf(scan.nextLine());   //same as -> int N = scan.nextInt();
        System.out.println("Sum of Multiple of "+ N + " = " + SumofMultipleofN(N));
        */

        //GetPossibleOutput();
        //PrintTriangle(N);

        boolean run = true;
        int balance = 0;
        Scanner scan = new Scanner(System.in);

        while(run){
            System.out.println("-------------------------------------------");
            System.out.println("1.Deposit | 2.Withdraw | 3.Balance | 4.Exit");
            System.out.println("-------------------------------------------");
            System.out.print("Choose > ");

            int n;
            switch(scan.nextInt()){
                case 1:
                System.out.print("Deposit value > "); balance += scan.nextInt(); break;
                case 2: 
                System.out.print("Withdraw value > "); 
                n = scan.nextInt(); 
                if(n > balance) balance = 0;
                else balance -=n;
                break;
                case 3:
                System.out.println("Balance > " + balance); break;
                case 4:
                System.out.println(); run = false; break;
            }
        }
        System.out.print("Procedure Eliminated");
    }
}

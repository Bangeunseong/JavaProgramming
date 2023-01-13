package BankApplication;
import java.util.LinkedList;
import java.util.Scanner;

public class BankApplication {
    private static LinkedList<Account> AccountArray = new LinkedList<Account>();
    private static Scanner scan = new Scanner(System.in);
    private static Account findAccount(String ano){
        for(Account account : AccountArray){
            if(ano.equals(account.Get_ano())) return account;
        }
        return null;
    }

    @PrintAnnotation
    private static void CreateAccount(){
        System.out.print("Account Number: ");
        String AccountNum = scan.nextLine();
        System.out.print("Owner: ");
        String Owner = scan.nextLine();
        System.out.print("First Deposit Money: ");
        int Money = scan.nextInt();
        Account newAccount = new Account(AccountNum, Owner, Money);
        AccountArray.addLast(newAccount);
    }

    @PrintAnnotation
    private static void AccountList(){
        for(Account account : AccountArray){
            System.out.println(account.Get_ano() + " " + account.Get_Owner() + " " + account.Get_Balance());
        }
    }

    @PrintAnnotation
    private static void Deposit(){
        System.out.print("Account Number: "); String ano = scan.nextLine();
        Account F = findAccount(ano);
        if(F == null) {System.out.println("Result : Couldn't find Account!"); return;}

        System.out.print("Deposit: "); int M = scan.nextInt();
        F.Set_Balance(F.Get_Balance() + M);
        System.out.println("Result : Deposit Success!");
    }

    @PrintAnnotation
    private static void Withdraw(){
        System.out.print("Account Number: "); String ano = scan.nextLine();
        Account F = findAccount(ano);
        if(F == null) {System.out.println("Result : Couldn't find Account!"); return;}

        System.out.print("Withdraw: "); int M = scan.nextInt();
        if(F.Get_Balance() < M) {System.out.println("Result : Coudln't withdraw " + M + "$"); return;}
        F.Set_Balance(F.Get_Balance() - M);
        System.out.println("Result : Withdraw Success!");
    }

    public static void main(String[] args){
        boolean run = true;
        while(run){
            System.out.println("----------------------------------------------------------------");
            System.out.println("1.Make Account | 2.AccountList | 3.Deposit | 4.Withdraw | 5.Exit");
            System.out.println("----------------------------------------------------------------");
            System.out.print("Choose> ");
            
            int num = scan.nextInt(); scan.nextLine();
            switch(num){
                case 1:CreateAccount(); break;
                case 2:AccountList(); break;
                case 3:Deposit(); break;
                case 4:Withdraw(); break;
                case 5:run = false; break;
            }
        }
        System.out.println("Program Closed");
    }
}

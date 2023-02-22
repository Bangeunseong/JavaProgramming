package Class.BankAccount;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BankApplication {
    //Field
    private static Map<String,Account> map = new HashMap<String,Account>();
    
    private static Scanner scan = new Scanner(System.in);
    private enum Job {CreateAccount, AccountList, Deposit, Withdraw, Exit}

    //Method
    public static void createAccount(){
        System.out.println("-------------"); System.out.println(Job.CreateAccount); System.out.println("-------------");
        System.out.print("Account Number: "); String ano = scan.nextLine();
        System.out.print("Account Owner: "); String owner = scan.nextLine();
        System.out.print("Default Balance: "); String balance = scan.nextLine();
        if(map.containsKey(ano) == false){map.put(ano, new Account(ano, owner, Integer.parseInt(balance)));}
        else{System.out.println("Failed to CreateAccount\nCause: Account Number already exists!");}
    }

    public static void accountList(){
        Set<Map.Entry<String, Account>> set = map.entrySet();
        Iterator<Map.Entry<String,Account>> iterator = set.iterator();

        System.out.println("-------------"); System.out.println(Job.AccountList); System.out.println("-------------");
        while(iterator.hasNext()){
            Map.Entry<String,Account> entry = iterator.next();
            Account account = entry.getValue();
            System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
        }
    }

    public static void deposit(){
        System.out.println("-------------"); System.out.println(Job.Deposit); System.out.println("-------------");
        System.out.print("Account Number: "); String ano = scan.nextLine();
        if(map.containsKey(ano)){
            System.out.print("Deposit: "); String balance = scan.nextLine();
            int currentBalance = map.get(ano).getBalance();
            try{
                map.get(ano).setBalance(currentBalance + Integer.parseInt(balance));
                System.out.println("Deposit Success!");
            }
            catch(InvalidBalanceException e){System.out.println("Failed to deposit\nCause: " + e.getMessage());}
        }
        else{System.out.println("Failed to deposit\nCause: Wrong Account Number");}
    }

    public static void withdraw(){
        System.out.println("-------------"); System.out.println(Job.Withdraw); System.out.println("-------------");
        System.out.print("Account Number: "); String ano = scan.nextLine();
        if(map.containsKey(ano)){
            System.out.print("Withdraw: "); String balance = scan.nextLine();
            int currentBalance = map.get(ano).getBalance();
            try{
                map.get(ano).setBalance(currentBalance - Integer.parseInt(balance));
                System.out.println("Withdraw Success!");
            }
            catch(InvalidBalanceException e){System.out.println("Failed to withdraw\nCause: " + e.getMessage());}
        }
        else{System.out.println("Failed to withdraw\nCause: Wrong Account Number");}
    }

    public static void main(String[] args){
        boolean run = true;
        while(run){
            System.out.println("--------------------------------------------------------------");
            int i = 1;
            for(Job job : Job.values()){
                if(i != 1) System.out.print("| ");
                System.out.print(String.valueOf(i) + "." + job + " ");
                i++;
            }
            System.out.println();
            System.out.println("--------------------------------------------------------------");
            System.out.print("Choose> ");

            int selectNo = scan.nextInt();
            scan.nextLine();
            switch(selectNo){
                case 1: createAccount(); break;
                case 2: accountList(); break;
                case 3: deposit(); break;
                case 4: withdraw(); break;
                case 5: run = false; break;
            }
        }
    }
}

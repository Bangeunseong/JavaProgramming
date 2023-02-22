package Class.AccountService;

public class AccountExample {
    public static void main(String[] args){
        Account account = new Account();

        try{account.setBalance(10000);}
        catch(invalidBalanceException e){System.out.println(e.getMessage());}
        System.out.println("Current Balance: " + account.getBalance());

        try{account.setBalance(-100);}
        catch(invalidBalanceException e){System.out.println(e.getMessage());}
        System.out.println("Current Balance: " + account.getBalance());

        try{account.setBalance(2000000);}
        catch(invalidBalanceException e){System.out.println(e.getMessage());}
        System.out.println("Current Balance: " + account.getBalance());

        try{account.setBalance(300000);}
        catch(invalidBalanceException e){System.out.println(e.getMessage());}
        System.out.println("Current Balance: " + account.getBalance());
    }
}

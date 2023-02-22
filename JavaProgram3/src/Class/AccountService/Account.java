package Class.AccountService;

public class Account {
    //Field
    private static int MIN_BALANCE, MAX_BALANCE;
    private int balance;
    static{
        MIN_BALANCE = 0;
        MAX_BALANCE = 1000000;
    }

    //Constructor
    public Account(){}
    public Account(int balance){this.balance = balance;}

    //Method
    public void setBalance(int balance) throws invalidBalanceException{
        if(balance < MIN_BALANCE || balance > MAX_BALANCE) throw new invalidBalanceException("Invalid Balance Input!");
        else this.balance = balance;
    }
    public int getBalance(){return balance;}
}

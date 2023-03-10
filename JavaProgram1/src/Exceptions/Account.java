package Exceptions;

public class Account {
    private long balance;

    public Account(){}

    public long getBalance(){return balance;}
    public void deposit(int money){balance += money;}
    public void withdraw(int money) throws BalanceInsufficientException{
        if(balance < money){throw new BalanceInsufficientException("Short of Balance: " + (money - balance));}
        balance -= money;
    }
}

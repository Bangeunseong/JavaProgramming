package Class.BankAccount;

public class InvalidBalanceException extends Exception {
    public InvalidBalanceException(){}
    public InvalidBalanceException(String message){super(message);}
}

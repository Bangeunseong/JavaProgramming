package Class.AccountService;

public class invalidBalanceException extends Exception {
    public invalidBalanceException(){}
    public invalidBalanceException(String message){super(message);}
}

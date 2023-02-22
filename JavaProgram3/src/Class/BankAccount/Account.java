package Class.BankAccount;

public class Account {
    private String ano, owner;
    private int balance;

    public Account(String ano, String owner, int balance){
        this.ano = ano; this.owner = owner; this.balance = balance;
    }

    public String getAno(){return ano;}
    public String getOwner(){return owner;}
    public int getBalance(){return balance;}
    public void setAno(String ano){this.ano = ano;}
    public void setOwner(String owner){this.owner = owner;}
    public void setBalance(int balance) throws InvalidBalanceException {
        if(balance < 0) throw new InvalidBalanceException("Invalid Modification of balance");
        else this.balance = balance;
    }
}

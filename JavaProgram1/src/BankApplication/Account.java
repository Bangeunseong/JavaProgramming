package BankApplication;

public class Account {
    private String ano;
    private String Owner;
    private int Balance;

    public Account(){ano = "Unknown"; Owner = "Unknown"; Balance = 0;}
    public Account(String ano, String Owner, int Balance){
        this.ano = ano; this.Owner = Owner; this.Balance = Balance;
    }

    public void Set_ano(String ano){this.ano = ano;}
    public String Get_ano(){return ano;}
    public void Set_Owner(String Owner){this.Owner = Owner;}
    public String Get_Owner(){return Owner;}
    public void Set_Balance(int Balance){this.Balance = Balance;}
    public int Get_Balance(){return Balance;}
}

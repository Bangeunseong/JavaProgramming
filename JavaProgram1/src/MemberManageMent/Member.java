package MemberManageMent;

public class Member {
    //Variables
    private String ID, Password;
    
    //Constructor
    public Member(){ID ="Unknown"; Password ="Unknown";}
    public Member(String ID, String Password){this.ID = ID; this.Password = Password;}

    //Method
    public void setID(String ID){this.ID = ID;}
    public void setPassword(String Password){this.Password = Password;}
    public String getID(){return ID;}
    public String getPassWord(){return Password;}
}

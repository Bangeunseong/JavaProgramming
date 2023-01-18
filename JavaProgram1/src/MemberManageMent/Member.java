package MemberManageMent;

public class Member {
    //Variables
    private String ID, Password;
    
    //Constructor
    Member(){}
    Member(String ID, String Password){this.ID = ID; this.Password = Password;}

    //Method
    void setID(String ID){this.ID = ID;}
    void setPassword(String Password){this.Password = Password;}
    String getID(){return ID;}
    String getPassWord(){return Password;}
}

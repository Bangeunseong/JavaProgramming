package MemberManageMent;
import java.util.LinkedList;
import java.util.Scanner;

public class MemberList {
    LinkedList<Member> members = new LinkedList<Member>();
    
    public void SignUp(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("ID: "); String ID = scan.nextLine();
        System.out.print("PassWord: "); String Password = scan.nextLine();

        members.addFirst(new Member(ID, Password));
        scan.close();
    }
    public void Login(String ID, String Password) throws NotExistIDException, WrongPasswordException{
        for(Member member : members){
            if(member.getID().equals(ID)){
                if(member.getPassWord().equals(Password)){System.out.println("Login Success!"); return;}
            }
            else throw new WrongPasswordException("Wrong PassWord!");
        }
        throw new NotExistIDException("Wrong ID!");
    }
}

package MemberManageMent;
import java.util.LinkedList;

public class MemberList {
    LinkedList<Member> members = new LinkedList<Member>();
    public void SignUp(String ID, String Password){
        members.addFirst(new Member(ID, Password));
    }
    public void Login(String ID, String Password) throws NotExistIDException, WrongPasswordException{
        for(Member member : members){
            if(member.getID().equals(ID)){
                if(member.getPassWord().equals(Password)){System.out.println("Login Success!"); return;}
                else throw new WrongPasswordException("Wrong PassWord!");
            }
        }
        throw new NotExistIDException("Wrong ID!");
    }
}

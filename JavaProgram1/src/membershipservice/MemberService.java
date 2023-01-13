package membershipservice;

public class MemberService {
    static int index = 0;
    Member[] members = new Member[100];

    void InsertMember(String name, int age, String id, String password){
        members[index++] = new Member(name,age,id,password);
    }

    boolean Login(String id, String password){
        for(Member member : members){
            if(member == null) return false;
            if(member.id.equals(id) && member.GetPassword().equals(password)){
                if(member.LoginStatus == 1) {System.out.println("Already Logged in!"); return false;}
                member.LoginStatus = 1;
                System.out.println("Login Success!"); return true;
            }
        }
        return false;
    }

    boolean Logout(String id){
        for(Member member : members){
            if(member == null) return false;
            if(member.id.equals(id) && member.LoginStatus == 1){
                if(member.LoginStatus == 0){System.out.println("Already Logged out!"); return false;}
                member.LoginStatus = 0;
                System.out.println("Logout Success!"); return true;
            }
        }
        System.out.println("ID doesn't exist!");
        return false;
    }
}

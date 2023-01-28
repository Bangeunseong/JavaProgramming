package Class.Member;

import java.util.HashMap;

public class MemberService {
    //Field
    HashMap<Integer, Member> members = new HashMap<Integer, Member>();

    //Method
    void SignUp(String name, String age, String id, String password){
        Member member = new Member(name, Integer.parseInt(age), id, password);
        members.put(member.hashCode(), member);
    }
    void Login(String id, String password)throws ID_UnmatchException, PassWord_UnmatchException{
        if(members.containsKey(id.hashCode()) == false){throw new ID_UnmatchException("Incorrect ID!");}

        Member member = members.get(id.hashCode());
        if(member.comparePassword(password)){System.out.println("Login Success!");}
        else throw new PassWord_UnmatchException("Incorrect Password!");
    }
    void Logout(String id)throws ID_UnmatchException{
        if(members.containsKey(id.hashCode()) == false) throw new ID_UnmatchException("ID doesn't exist!");
        System.out.println("Logout Success!");
    }
}

package Class.MemberService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberService {
    //Field
    private static Map<Integer, Member> map = new HashMap<Integer, Member>();

    //Constructor
    public MemberService(){}
    public MemberService(List<Member> list){
        for(Member member : list){ map.put(member.hashCode(), member);}
    }

    //Method
    public void InsertMember(Member member){map.put(member.hashCode(), member);}
    public static Member GetMember(String ID, String Password) throws Exception{
        int key = ID.hashCode() + Password.hashCode();
        if(map.containsKey(key)) return map.get(key);
        else {throw new Exception("Member doesn't exist!");}
    }
    public static void login(String ID, String Password){
        try{
            Member member = GetMember(ID, Password);
            System.out.println("Welcome Home " + member.getName() + "!");
        }
        catch(Exception e){System.out.println(e.getMessage());}
    }

    public static void main(String[] args){
        MemberService memberService = new MemberService(
            Arrays.asList(
                new Member("Honggildong", "Hong", "12345"),
                new Member("Gogildong", "SwordMaster", "12345"),
                new Member("ShinJjanggu", "Devilgu", "66666"),
                new Member("Henry", "Jackthereaper", "1234567")
            )
        );

        MemberService.login("Hong", "123456");
    }
}

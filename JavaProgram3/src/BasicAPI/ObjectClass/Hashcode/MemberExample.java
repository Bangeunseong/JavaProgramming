package BasicAPI.ObjectClass.Hashcode;

import java.util.HashMap;
import java.util.Map;

public class MemberExample {
    public static void main(String[] args){
        Map<Integer,Member> hashMap = new HashMap<Integer,Member>();

        Member member = new Member("Honggildong");
        hashMap.put(member.hashCode(), member);
        String value = hashMap.get(member.hashCode()).id;
        System.out.println(value);
    }
}

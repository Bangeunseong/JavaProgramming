package CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args){
        Set<Member> set = new HashSet<Member>();
        
        set.add(new Member("Honggildong", 30));
        set.add(new Member("Honggildong", 30)); //Doesn't add same object

        System.out.println("Total Objects: " + set.size());
    }
}

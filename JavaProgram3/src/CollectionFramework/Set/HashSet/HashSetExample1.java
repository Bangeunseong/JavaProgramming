package CollectionFramework.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");

        int size = set.size();
        System.out.println("Total objects: " + size);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println("\t" + iterator.next());
        }
    }
}

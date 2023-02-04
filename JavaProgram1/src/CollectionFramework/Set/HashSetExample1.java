package CollectionFramework.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();

        set.add("Java"); set.add("JDBC");
        set.add("iBATIS"); set.add("Servlet/JSP");

        int size = set.size();
        System.out.println("Total objects: " + size);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC"); set.remove("iBATIS");

        System.out.println("Total objects: " + set.size());

        iterator = set.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.clear();
        if(set.isEmpty()){System.out.println("Empty!");}
    }
}

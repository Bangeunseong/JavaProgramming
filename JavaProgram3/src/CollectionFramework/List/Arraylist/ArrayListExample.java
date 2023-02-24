package CollectionFramework.List.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "Database");
        list.add("iBATIS");

        int size = list.size();
        System.out.println("Total objects: " + size);

        String skill = list.get(2);
        System.out.println("2: " + skill);
        
        System.out.println(list.toString());

        list.remove(2);
        list.remove(2);
        list.remove("iBATIS");

        System.out.println(list.toString());
    }
}

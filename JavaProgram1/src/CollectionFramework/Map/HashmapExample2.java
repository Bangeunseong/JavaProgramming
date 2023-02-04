package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample2 {
    public static void main(String[] args){
        Map<Student,Integer> map = new HashMap<Student,Integer>();

        map.put(new Student(1, "Honggildong"), 95);
        map.put(new Student(1, "Honggildong"), 95);

        System.out.println("Total Entry count: " + map.size());
    }
}

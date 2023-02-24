package CollectionFramework.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String[] args){
        Map<Student,Integer> map = new HashMap<Student,Integer>();

        map.put(new Student(1, "Honggildong"), 95);
        map.put(new Student(1, "Honggildong"), 95);

        System.out.println("Total entrysize: " + map.size());
    }
}

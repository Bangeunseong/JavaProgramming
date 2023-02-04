package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapExample1 {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Shinyeongman", 85);
        map.put("Honggildong", 90);
        map.put("Jacklin", 80);
        map.put("Henry Davison", 95);
        System.out.println("Total Entry count: " + map.size());

        System.out.println("\tHonggildong: " + map.get("Honggildong"));
        System.out.println();

        Set<String> keyset = map.keySet();
        Iterator<String> keyiterator = keyset.iterator();
        while(keyiterator.hasNext()){
            String key = keyiterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }

        map.remove("Honggildong");
        System.out.println("Total Entry count: " + map.size());

        Set<Map.Entry<String,Integer>> entryset = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryiterator = entryset.iterator();

        while(entryiterator.hasNext()){
            Map.Entry<String,Integer> entry = entryiterator.next();
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        map.clear();
        System.out.println("Total Entry count: " + map.size());
    }
}

package CollectionFramework.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Shinhyeonman", 85);
        map.put("HarryStyles", 90);
        map.put("Honggildong", 95);
        map.put("James", 100);
        System.out.println("Total Entrysize: " + map.size());

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String key = keyIterator.next();
            System.out.println("\t" + key + " : " + map.get(key));
        }
        System.out.println();

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String,Integer> entry = entryIterator.next();
            System.out.println("\t" + entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }
}

package CollectionFramework.CollectionExample.HashMapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong",86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Map.Entry<String,Integer>> set = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            totalScore += entry.getValue();
            if(maxScore < entry.getValue()){maxScore = entry.getValue(); name = entry.getKey();}
        }
        System.out.println("Average: " + (totalScore/set.size()));
        System.out.println("MaxScore: " + maxScore);
        System.out.println("MaxScore ID: " + name);
    }
}

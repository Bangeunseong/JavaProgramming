package CollectionFramework.Example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;
        
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            totalScore += entry.getValue();
            if(maxScore < entry.getValue()){name = entry.getKey(); maxScore = entry.getValue();}
        }
        System.out.println("Average: " + ((double)totalScore/map.size()) + "\nBestScore: " + maxScore + "\nID: " + name);
    }
}

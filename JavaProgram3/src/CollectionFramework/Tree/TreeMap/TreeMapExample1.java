package CollectionFramework.Tree.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String[] args){
        TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
        scores.put(87, "Honggildong");
        scores.put(98, "Leedongsu");
        scores.put(75, "Parkhyeonja");
        scores.put(95, "Shinjeongyeon");
        scores.put(80, "Kimjava");

        Map.Entry<Integer,String> entry = null;

        entry = scores.firstEntry();
        System.out.println("Lowest score: " + entry.getKey() + "-" + entry.getValue());
        entry = scores.lastEntry();
        System.out.println("Highest score: " + entry.getKey() + "-" + entry.getValue());
        entry = scores.lowerEntry(95);
        System.out.println("Lower score than 95: " + entry.getKey() + "-" + entry.getValue());
        entry = scores.higherEntry(95);
        System.out.println("Higher score than 95: " + entry.getKey() + "-" + entry.getValue());
        entry = scores.floorEntry(95);
        System.out.println("Same or lower score than 95: " + entry.getKey() + "-" + entry.getValue());
        entry = scores.ceilingEntry(85);
        System.out.println("Same or higher score than 85: " + entry.getKey() + "-" + entry.getValue());

        while(!scores.isEmpty()){
            entry = scores.pollFirstEntry();
            System.out.println(entry.getKey() + "-"+entry.getValue() + "(Objects Left: " + scores.size() + ")");
        }

        System.gc();
    }
}

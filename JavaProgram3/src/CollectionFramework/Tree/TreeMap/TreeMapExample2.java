package CollectionFramework.Tree.TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
    public static void main(String[] args){
        TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
        scores.put(87, "Honggildong");
        scores.put(98, "Leedongsu");
        scores.put(75, "Parkhyeonja");
        scores.put(95, "Shinjeongyeon");
        scores.put(80, "Kimjava");

        NavigableMap<Integer,String> descendingMap = scores.descendingMap();
        Set<Map.Entry<Integer,String>> descendingEntrySet = descendingMap.entrySet();
        for(Map.Entry<Integer,String> entry : descendingEntrySet){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println();

        NavigableMap<Integer,String> ascendingMap = descendingMap.descendingMap();
        Set<Map.Entry<Integer,String>> ascendingEntrySet = ascendingMap.entrySet();
        for(Map.Entry<Integer,String> entry : ascendingEntrySet){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.gc();
    }
}

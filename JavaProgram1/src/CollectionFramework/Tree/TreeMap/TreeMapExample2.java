package CollectionFramework.Tree.TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
    public static void main(String[] args){
        TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
        scores.put(new Integer(87), "Honggildong");
        scores.put(new Integer(98), "Leedongsu");
        scores.put(new Integer(75),"Parkhyeonwu");

        NavigableMap<Integer,String> descendingMap = scores.descendingMap();
        Set<Map.Entry<Integer,String>> decendingEntrySet = descendingMap.entrySet();
        for(Map.Entry<Integer,String> entry : decendingEntrySet){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println();

        NavigableMap<Integer,String> ascendingMap = descendingMap.descendingMap();
        Set<Map.Entry<Integer,String>> ascendingEntrySet = ascendingMap.entrySet();
        for(Map.Entry<Integer,String> entry : ascendingEntrySet){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println();
    }
}

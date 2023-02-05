package CollectionFramework.Tree.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String[] args){
        TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
        scores.put(new Integer(87), "Honggildong");
        scores.put(new Integer(98), "Leedongsu");
        scores.put(new Integer(75), "Parkgilsoon");
        scores.put(new Integer(95), "Shinyongsoon");
        scores.put(new Integer(80), "Gary Holson");

        Map.Entry<Integer,String> mapEntry = null;

        mapEntry = scores.firstEntry();
        System.out.println("Lowest score: " + mapEntry.getKey() + "-" + mapEntry.getValue());
        mapEntry = scores.lastEntry();
        System.out.println("Highest score: " + mapEntry.getKey() + "-" + mapEntry.getValue());
        mapEntry = scores.lowerEntry(new Integer(95));
        System.out.println("Lower than 95: " + mapEntry.getKey() + "-" + mapEntry.getValue());
        mapEntry = scores.higherEntry(new Integer(95));
        System.out.println("Higher than 95: " + mapEntry.getKey() + "-" + mapEntry.getValue());
        mapEntry = scores.floorEntry(new Integer(95));
        System.out.println("Lower than or same 95: " + mapEntry.getKey() + "-" + mapEntry.getValue());
        mapEntry = scores.ceilingEntry(new Integer(85));
        System.out.println("Higher than or same 85: " + mapEntry.getKey() + "-" + mapEntry.getValue());

        while(!scores.isEmpty()){
            mapEntry = scores.pollFirstEntry();
            System.out.println(mapEntry.getKey() + "-" + mapEntry.getValue() + "(" + scores.size() + " Objects Left)");
        }
    }
}
package CollectionFramework.Tree.TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
    public static void main(String[] args){
        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cherry");

        System.out.println("[Searching words c~f]");
        NavigableSet<String> headSet = treeSet.headSet("f", true);
        NavigableSet<String> tailSet = treeSet.tailSet("b", true);
        NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
        
        System.out.println("HeadSet");
        for(String word : headSet){System.out.println(word);}

        System.out.println("\nTailSet");
        for(String word : tailSet){System.out.println(word);}

        System.out.println("\nRangeSet");
        for(String word : rangeSet){System.out.println(word);}
    }
}

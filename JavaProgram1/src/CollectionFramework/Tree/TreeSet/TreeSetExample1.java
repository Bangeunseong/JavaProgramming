package CollectionFramework.Tree.TreeSet;

import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args){
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        Integer score = null;

        score = scores.first();
        System.out.println("Lowest score: " + score);
        score = scores.last();
        System.out.println("Highest score: " + score + "\n");
        score = scores.lower(new Integer(95));
        System.out.println("Closest lower score: " + score);
        score = scores.higher(new Integer(95));
        System.out.println("Closest higher score: " + score + "\n");
        score = scores.floor(new Integer(95));
        System.out.println("Closest lower or equal score: " + score);
        score = scores.ceiling(new Integer(85));
        System.out.println("Closest higher or equal score: " + score);

        while(!scores.isEmpty()){
            score = scores.pollFirst();
            System.out.println(score + "(Leftover objects count: " + scores.size() + ")");
        }
    }
}

package CollectionFramework.Tree.TreeSet;

import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args){
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        Integer score = null;

        score = scores.first();
        System.out.println("Lowest score: " + score);
        score = scores.last();
        System.out.println("Highest score: " + score);
        score = scores.lower(95);
        System.out.println("Below 95: " + score);
        score = scores.higher(95);
        System.out.println("Upper 95: " + score);
        score = scores.floor(95);
        System.out.println("Same or below 95: " + score);
        score = scores.ceiling(85);
        System.out.println("Same or upper 85: " + score);

        while(!scores.isEmpty()){
            score = scores.pollFirst();
            System.out.println(score + "(Objects left: " + scores.size() + ")");
        }
    }
}

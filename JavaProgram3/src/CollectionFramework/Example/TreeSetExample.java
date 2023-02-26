package CollectionFramework.Example;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args){
        TreeSet<Member> treeSet = new TreeSet<Member>();
        treeSet.add(new Member("blue", 96));
        treeSet.add(new Member("hong", 86));
        treeSet.add(new Member("white", 92));

        Member member = treeSet.last();
        System.out.println("BestScore: " + member.score);
        System.out.println("ID: " + member.id);
    }
}

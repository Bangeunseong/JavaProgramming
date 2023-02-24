package CollectionFramework.Tree.UsingComparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args){
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
        treeSet.add(new Fruit("Grape", 3000));
        treeSet.add(new Fruit("Watermelon", 10000));
        treeSet.add(new Fruit("Strawberry", 6000));

        Iterator<Fruit> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            Fruit fruit = iterator.next();
            System.out.println(fruit.name+":"+fruit.price);
        }
    }
}

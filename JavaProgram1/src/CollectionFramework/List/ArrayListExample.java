package CollectionFramework.List;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args){
        //Arraylist Class
        List<String> list = new ArrayList<String>();

        list.add("JAVA"); list.add("JDBC");
        list.add("Servlet/JSP"); list.add(2, "Database");
        list.add("iBATIS");

        int size = list.size();
        System.out.println("Total Objects: " + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2: " + skill);
        System.out.println();

        for(String str:list){System.out.println(str);}
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("iBATIS");

        for(String str:list){System.out.println(str);}
        System.out.println();

        //Using Arrays utility
        List<String> list1 = Arrays.asList("Honggildong","Java","ShinGyeon");
        for(String name:list1){System.out.println(name);}
        List<Integer> list2 = Arrays.asList(1,2,3,4);
        for(Integer num:list2){System.out.println(num);}

        //Vector
        List<Board> list_vector = new Vector<Board>();

        list_vector.add(new Board("Subject1", "Content1", "Writer1"));
        list_vector.add(new Board("Subject2", "Content2", "Writer2"));
        list_vector.add(new Board("Subject3", "Content3", "Writer3"));
        list_vector.add(new Board("Subject4", "Content4", "Writer4"));
        list_vector.add(new Board("Subject5", "Content5", "Writer5"));

        list_vector.remove(2);
        list_vector.remove(3);

        for(Board board:list_vector){
            System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        }

        //LinkedList
        //sequencial add or remove is faster than linkedlist, Searching is faster than linkedlist
        //add or remove in the middle is faster than arraylist
        List<String> list3 = new ArrayList<String>();       
        List<String> list_linked = new LinkedList<String>();

        long starttime;
        long endtime;

        starttime = System.nanoTime();
        for(int i = 0;i < 10000;i++) list3.add(0,String.valueOf(i));
        endtime = System.nanoTime();
        System.out.println("ArrayList execution time: " + (endtime - starttime) + "ns");

        starttime = System.nanoTime();
        for(int i = 0; i < 10000; i++) list_linked.add(0, String.valueOf(i));
        endtime = System.nanoTime();
        System.out.println("LinkedList execution time: " + (endtime - starttime) + "ns");
    }
}

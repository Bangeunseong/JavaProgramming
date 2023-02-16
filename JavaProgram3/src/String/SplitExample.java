package String;

import java.util.StringTokenizer;

public class SplitExample {
    public static void main(String[] args){
        String str = "ID,Name,Password";

        //Using split
        String[] list1 = str.split(",");
        for(String obj : list1) System.out.println(obj);
        System.out.println();

        //Using stringtokenizer
        StringTokenizer list2 = new StringTokenizer(str, ",");
        while(list2.hasMoreTokens()){
            System.out.println(list2.nextToken());
        }
    }
}

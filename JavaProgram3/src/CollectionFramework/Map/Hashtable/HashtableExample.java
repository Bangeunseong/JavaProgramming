package CollectionFramework.Map.Hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
    public static void main(String[] args){
        Map<String,String> map = new Hashtable<String,String>();
        map.put("spring", "12");
        map.put("summer", "123");
        map.put("fall", "1234");
        map.put("winter", "12345");

        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Type ID and Password");
            System.out.print("ID: "); String id = scan.nextLine();

            System.out.print("PassWord: "); String password = scan.nextLine();
            System.out.println();

            if(map.containsKey(id)){
                if(map.get(id).equals(password)){System.out.println("Login Success!"); break;}
                else System.out.println("Wrong Password!");
            }
            else System.out.println("Wrong ID!");
        }
        scan.close();
    }
}

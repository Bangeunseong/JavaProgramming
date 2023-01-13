package TouristManagement;
import java.util.Scanner;
public class TouristList {
    public static void main(String[] args) {
        System.out.print("How many tourist in the list? -> ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Tourist[] T_List = new Tourist[num];
        scan.nextLine();
        for(int i = 0; i < num; i++){
            System.out.print("Type your nation> ");
            String nation = scan.nextLine();
            
            System.out.print("Type your name> ");
            String name = scan.nextLine();
            
            System.out.print("Type your ssn> ");
            String ssn = scan.nextLine();
            T_List[i] = new Tourist(nation, ssn, name);
        }
        scan.close();
        for(Tourist val : T_List) {System.out.println(val.nation + " " + val.name + " " + val.ssn);}
    }
}
package membershipservice;

import java.util.Scanner;
public class MemberServiceExample {
    public static void main(String[] args){
        MemberService memberService = new MemberService();
        System.out.println("--------MemberShip Service Console--------");
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while(run){
            System.out.println("-------------Choose Service-------------");
            System.out.print("1.Sign Up | 2.Login | 3.Logout > ");
            int n = scan.nextInt(); scan.nextLine();
            String Name, ID, PassWord; int age;
            switch(n){
                case 1:
                System.out.print("Name : "); Name = scan.nextLine();
                System.out.print("Age : "); age = scan.nextInt(); scan.nextLine();
                System.out.print("ID : "); ID = scan.nextLine();
                System.out.print("Password : "); PassWord = scan.nextLine();
                memberService.InsertMember(Name, age, ID, PassWord); break;
                case 2:
                System.out.print("ID : "); ID = scan.nextLine();
                System.out.print("Password : "); PassWord = scan.nextLine();
                if(memberService.Login(ID, PassWord) == false) {System.out.println("Login failed!"); continue;} break;
                case 3:
                System.out.print("ID : "); ID = scan.nextLine();
                if(memberService.Logout(ID) == false) {System.out.println("Logout failed!"); continue;} run = false; break;
                default:
                System.out.println("Wrong Input!"); break;
            }
        }
        scan.close();
    }
}

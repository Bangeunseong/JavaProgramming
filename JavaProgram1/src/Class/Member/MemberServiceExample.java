package Class.Member;

import java.util.Scanner;

public class MemberServiceExample {
    public static void main(String[] args){
        MemberService memberService = new MemberService();
        Scanner scan = new Scanner(System.in);

        boolean run = true;
        while(run){
            System.out.print("SignUp | Login | Logout > ");
            String job = scan.nextLine();
            if(job.equals("SignUp")) {
                System.out.print("Name: "); String name = scan.nextLine();
                System.out.print("Age: "); String age = scan.nextLine();
                System.out.print("ID: "); String ID = scan.nextLine();
                System.out.print("Password: "); String Password = scan.nextLine();
                memberService.SignUp(name, age, ID, Password);
            }
            else if(job.equals("Login")){
                System.out.print("ID: "); String name = scan.nextLine();
                System.out.print("Password: "); String password = scan.nextLine();
                try{memberService.Login(name, password);}
                catch(ID_UnmatchException e){System.out.println(e.getMessage());}
                catch(PassWord_UnmatchException e){System.out.println(e.getMessage());}
            }
            else if(job.equals("Logout")){
                System.out.print("ID: "); String name = scan.nextLine();
                try{memberService.Logout(name); run = false;}
                catch(ID_UnmatchException e){System.out.println(e.getMessage());}
            }
            else System.out.println("Wrong Input!");
        }
        scan.close();
    }
}

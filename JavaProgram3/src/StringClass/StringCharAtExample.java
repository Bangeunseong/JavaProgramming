package StringClass;

import java.util.regex.Pattern;

public class StringCharAtExample {
    public static void main(String[] args){
        String ssn = "000813-1311141";
        String regExp = "[0-9]{6}-[0-9]{7}";
        if(Pattern.matches(regExp, ssn)){
            char sex = ssn.charAt(7);
            switch(Integer.parseInt(String.valueOf(sex))){
            case 1: case 3:
            System.out.println("MALE"); break;
            case 2: case 4:
            System.out.println("FEMALE"); break;
            }
        }
        else System.out.println("Wrong input!");
    }
}

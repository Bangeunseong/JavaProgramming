package BasicAPI.String;

import java.util.regex.Pattern;

public class PatternMatchExample {
    public static void main(String[] args){
        String id="5Angel1004";
        String regExp="[a-zA-Z]\\w+{8,12}";
        boolean isMatch = Pattern.matches(regExp, id);
        if(isMatch) System.out.println("Valid ID");
        else System.out.println("Invalid ID");
    }
}

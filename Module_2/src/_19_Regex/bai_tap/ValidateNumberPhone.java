package _19_Regex.bai_tap;

import java.util.regex.Pattern;

public class ValidateNumberPhone {
    private static final String REGEX = "[(]{1}\\d{2}[)]{1}[-]{1}[(]{1}[0]{1}[\\d]{9}[)]{1}";
    public static void validateNumber(String number){
        boolean check = Pattern.matches(REGEX, number);
        if (check){
            System.out.println("Pass");
        }else {
            System.out.println("Fault");
        }
    }
}

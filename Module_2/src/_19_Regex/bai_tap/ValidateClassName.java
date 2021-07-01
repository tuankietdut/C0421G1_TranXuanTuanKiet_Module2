package _19_Regex.bai_tap;

import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String REGAX ="[CAP]{1}[\\d]{4}[GHIKLM]{1}";

    public static void validateNameClass(String name){
        boolean check = Pattern.matches(REGAX, name);
        if (check){
            System.out.println("Từ hợp lệ pass");
        } else {
            System.out.println("Không hợp lệ , notPass");
        }
    }
}

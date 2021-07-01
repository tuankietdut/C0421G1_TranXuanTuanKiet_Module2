package _19_Regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private Pattern pattern;
    private Matcher matcher;
    private static final String REGEX = "^[_a-z0-9]{6,}$";

    public ValidateAccount() {
        pattern = Pattern.compile(REGEX);
    }
    public boolean validate(String str){
        matcher = pattern.matcher(str);
        return matcher.matches();
    }
}

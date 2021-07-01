package _19_Regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private Pattern pattern;
    private Matcher matcher;
    private static final String REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public ValidateEmail() {
        pattern = Pattern.compile(REGEX);
    }
    public boolean validate(String str){
        matcher = pattern.matcher(str);
        return matcher.matches();
    }
}

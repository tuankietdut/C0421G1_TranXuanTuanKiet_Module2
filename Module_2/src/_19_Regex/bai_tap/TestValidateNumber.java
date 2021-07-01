package _19_Regex.bai_tap;

public class TestValidateNumber {
    public static void main(String[] args) {
        String[] number = {"(84)-(0978489648)", "(a8)-(22222222)", "(65)-(0955625145)"};
        for (String element: number){
            ValidateNumberPhone.validateNumber(element);
        }
    }
}

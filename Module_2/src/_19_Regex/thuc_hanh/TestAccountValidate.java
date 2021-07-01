package _19_Regex.thuc_hanh;

public class TestAccountValidate {
    public static void main(String[] args) {
        String[] input = {"123abc_", "_abc123", "______", "123456","abcdefgh" };
        String[] input2 = {".@", "12345", "1234_", "abcde"};
        for (String element: input){
            System.out.println(new ValidateAccount().validate(element));
        }
        System.out.println("Input2");
        for (String element: input2){
            System.out.println(new ValidateAccount().validate(element));
        }

    }
}

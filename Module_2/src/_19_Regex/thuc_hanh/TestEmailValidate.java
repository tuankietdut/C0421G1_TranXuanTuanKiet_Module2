package _19_Regex.thuc_hanh;

public class TestEmailValidate {
    public static void main(String[] args) {
        String[] input = { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
        String[] input2 ={"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
        for (String element: input){
            System.out.println(new ValidateEmail().validate(element));
        }

        System.out.println("Input 2");
        for (String element: input2){
            System.out.println(new ValidateEmail().validate(element));
        }

    }
}

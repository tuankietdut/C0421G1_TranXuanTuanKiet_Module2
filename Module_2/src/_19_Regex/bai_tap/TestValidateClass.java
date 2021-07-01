package _19_Regex.bai_tap;

public class TestValidateClass {
    public static void main(String[] args) {
        String[] input = {" M0318G", "P0323A", "C0318G"};
        for (String element: input){
            ValidateClassName.validateNameClass(element);
        }
    }
}

package _08_clean_code.thuc_hanh;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(8));
        System.out.println(fizzBuzz(15));
    }
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if(isBuzz && isFizz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }
}

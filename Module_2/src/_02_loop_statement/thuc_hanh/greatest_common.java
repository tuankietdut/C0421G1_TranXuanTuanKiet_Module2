package _02_loop_statement.thuc_hanh;

import java.util.Scanner;

public class greatest_common {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số đầu tiên: ");
        int numberOne = scanner.nextInt();
        numberOne = Math.abs(numberOne);
        System.out.println("Nhập số thứ hai: ");
        int numberTwo = scanner.nextInt();
        numberTwo = Math.abs(numberTwo);
        int result = 0;
        boolean check = false;
        if (numberOne==0 || numberTwo==0){
            System.out.println("No greatest common");
        } else if (numberOne>numberTwo){
            for (byte i =1; i<=numberTwo;i++){
                if ((numberOne%i==0) && (numberTwo%i==0)){
                    result = i;
                    check = true;
                }
            }
        }else {
            for (byte i =1; i<=numberOne;i++){
                if ((numberOne%i==0) && (numberTwo%i==0)){
                    result = i;
                    check = true;
                }
            }
        }
        if (check){
            System.out.println("Ước chung lớn nhất của hai số là: " + result);
        }
    }
}

package _02_loop_statement.thuc_hanh;

import java.util.Scanner;

public class check_is_prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn kiểm tra: ");
        int number = scanner.nextInt();
        byte count =0;
        for (byte i=1; i<=Math.sqrt(number); i++){
            if (number%i == 0){
                count++;
            }
        }
        if (count==1){
            System.out.println(number + " Là số nguyên tố");
        } else {
            System.out.println(number + " Không phải là số nguyên tố");
        }
    }
}

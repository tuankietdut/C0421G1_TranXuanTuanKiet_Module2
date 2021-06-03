package _02_loop_statement.thuc_hanh;

import java.util.Scanner;

public class MoneyBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số tiền bạn muốn gửi: ");
        int money = scanner.nextInt();
        System.out.println("Số tháng bạn muốn gửi: ");
        int month = scanner.nextInt();
        System.out.println("Tỷ suất lãi theo năm: ");
        float interestRate = scanner.nextFloat();
        float sum =0;
        for (byte i =0; i< month; i++){
            sum += money*((interestRate/100)/12)*month;
        }
        System.out.println("Tiền lãi có được: "+ sum);
    }
}

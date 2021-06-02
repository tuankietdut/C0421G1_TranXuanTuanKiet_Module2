package _01_java_introduction.bai_tap;

import java.util.Scanner;

public class TransferMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tỷ giá ngày hôm này 1$ = 23.000VND");
        System.out.println("Mời bạn nhập $ muốn đổi");
        int moneyUsa = scanner.nextInt();
        int moneyVnd = moneyUsa * 23000;
        System.out.println("Tiền đã được convert là: "+ moneyVnd + " Vnd");
    }
}

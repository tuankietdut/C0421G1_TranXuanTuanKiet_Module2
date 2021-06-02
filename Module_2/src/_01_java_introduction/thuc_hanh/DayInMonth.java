package _01_java_introduction.thuc_hanh;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tháng bạn muốn tính: ");
        int a = scanner.nextInt();
        switch (a){
            case 1,3,5,7,8,10,12:
                System.out.println("Tháng "+ a + " có 31 ngày!!");
                break;
            case 2:
                System.out.println("Tháng "+ a + " có 28 hoặc 29 ngày");
                break;
            case 4,6,9,11:
                System.out.println("Tháng "+ a +" có 30 ngày");
                break;
        }
    }
}

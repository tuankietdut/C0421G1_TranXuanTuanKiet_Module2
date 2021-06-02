package _01_java_introduction.thuc_hanh;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm bạn muốn kiểm tra: ");
        int year = scanner.nextInt();
        if (year%4 ==0){
            if (year%100 ==0){
                if (year%400 ==0){
                    System.out.println(year + " là năm nhuận");
                } else {
                    System.out.println(year + " không phải là năm nhuận");
                }
            } else {
                System.out.println(year + " là năm nhuận");
            }
        } else {
            System.out.println(year + " là năm không nhuận");
        }
    }
}

package _01_java_introduction.bai_tap;

import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn vào!!");
        String name = scanner.nextLine();
        System.out.println("Chào "+ name);
    }
}

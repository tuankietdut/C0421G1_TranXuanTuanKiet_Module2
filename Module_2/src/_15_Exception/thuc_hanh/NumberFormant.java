package _15_Exception.thuc_hanh;

import java.util.Scanner;

public class NumberFormant {
    public static void calculate(int x, int y){
        try {
            int a = x + y;
            int b = x -y;
            int c = x*y;
            int d = x/y;
            System.out.println("Tổng là : " + a);
            System.out.println("Hiệu là : " + b);
            System.out.println("Tích là : " + c);
            System.out.println("Thương là : " + d);
        }catch (NumberFormatException e){
            System.out.println("divise zero");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = scanner.nextInt();
        System.out.println("Input y");
        int y = scanner.nextInt();
        calculate(x,y);
    }
}

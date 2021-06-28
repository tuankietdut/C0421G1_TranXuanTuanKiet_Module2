package _15_Exception.bai_tap;

import java.util.Random;
import java.util.Scanner;

public class TestTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a:");
        int a = scanner.nextInt();
        System.out.println("Nhập cạnh b:");
        int b = scanner.nextInt();
        System.out.println("Nhập cạnh c:");
        int c = scanner.nextInt();
        boolean check = false;
        while (!check) {
            try {
                findException(a, b, c);
                if (a < 0 || b < 0 || c < 0) throw new IllegalTriangleException("Value of triangle wrong");
                Triangle triangle = new Triangle(a, b, c);
                System.out.println(triangle.toString());
                check = true;
            } catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Nhập cạnh a:");
                a = scanner.nextInt();
                System.out.println("Nhập cạnh b:");
                b = scanner.nextInt();
                System.out.println("Nhập cạnh c:");
                c = scanner.nextInt();
            }
        }
    }

    public static void findException(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) throw new IllegalTriangleException("Value of triangle wrong");
        if ((a + b < c) || (a + c < b)
                || (c + b < a))
            throw new IllegalTriangleException("Value sum wrong");
    }
}

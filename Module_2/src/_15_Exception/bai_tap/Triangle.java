package _15_Exception.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Nhập cạnh a:");
        int a = scanner.nextInt();
        System.out.println("Nhập cạnh a:");
        int b = scanner.nextInt();
        System.out.println("Nhập cạnh a:");
        int c = scanner.nextInt();
        boolean check = false;
        while (!check) {
            try {
                findException(a, b, c);
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

    private int edgeOne = 0;
    private int edgeTwo = 0;
    private int edgeThree = 0;

    public Triangle(int edgeOne, int edgeTwo, int edgeThree) {
        this.edgeOne = edgeOne;
        this.edgeTwo = edgeTwo;
        this.edgeThree = edgeThree;
    }

    public Triangle() {
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "edgeOne=" + edgeOne +
                ", edgeTwo=" + edgeTwo +
                ", edgeThree=" + edgeThree +
                '}';
    }

    public static void findException(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) throw new IllegalTriangleException("Value of triangle wrong");
        if ((a + b < c) || (a + c < b)
                || (c + b < a))
            throw new IllegalTriangleException("Value sum wrong");
    }
}

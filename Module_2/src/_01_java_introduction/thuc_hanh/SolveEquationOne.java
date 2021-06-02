package _01_java_introduction.thuc_hanh;

import java.util.Scanner;

public class SolveEquationOne {
    public static void main(String[] args) {
        System.out.println("Equation: ax+b=c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Argument a: ");
        double a = scanner.nextDouble();
        System.out.println("Argument b: ");
        double b = scanner.nextDouble();
        System.out.println("Argument c: ");
        double c = scanner.nextDouble();
        if ((b==c) && (a==0)){
            System.out.println("Phương trình vô số nghiệm!!");
        } else if ((a==0) && (b!=c)){
            System.out.println("Phương trình vô nghiệm!!");
        } else {
            double x = ((c-b)/a);
            System.out.println("Result: "+x);
        }
    }
}

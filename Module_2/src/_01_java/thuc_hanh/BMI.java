package _01_java.thuc_hanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Chương trình tính chỉ số BMI start!!!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chỉ số chiều cao: ");
        double height = scanner.nextDouble();
        System.out.println("Nhập cân nặng của cơ thể: ");
        double weight = scanner.nextDouble();
        double bmi = weight/Math.pow(height,2);
        if (bmi<18.5){
            System.out.printf("%-10.2f%s",bmi,"Underweight");
        } else if (bmi <25){
            System.out.printf("%-10.2f%s",bmi,"Normal");
        } else if (bmi <30){
            System.out.printf("%-10.2f%s",bmi,"Overweight");
        } else {
            System.out.printf("%-10.2f%s",bmi,"Obese");
        }
    }
}

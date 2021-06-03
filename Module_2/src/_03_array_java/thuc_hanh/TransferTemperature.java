package _03_array_java.thuc_hanh;

import java.util.Scanner;

public class TransferTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius ");
            System.out.println("2. Celsius to Fahrenheit ");
            System.out.println("3. Exit");
            System.out.println("Input your choice");
            choice = scanner.nextByte();
            switch (choice){
                case 1:
                    System.out.println("Nhập số Fahrenheit: ");
                    float number = scanner.nextInt();
                    System.out.println("Fahrenheit to Celsius: "+ FelToCelsius(number));
                    break;
                case 2:
                    System.out.println("Nhập số Fahrenheit: ");
                    float numberTwo = scanner.nextInt();
                    System.out.println("Celsius to Fahrenheit: "+ celsiusToFel(numberTwo));
                    break;
                case 3:
                    System.exit(0);
            }
        }while (choice!=3);
    }

    public static double celsiusToFel(double celsius){
        double fahrenheit = celsius*(9.0/5) + 32;
        return fahrenheit;
    }
    public static double FelToCelsius(double fal){
        double celsius = (fal -32) * (5.0/9);
        return celsius;
    }
}

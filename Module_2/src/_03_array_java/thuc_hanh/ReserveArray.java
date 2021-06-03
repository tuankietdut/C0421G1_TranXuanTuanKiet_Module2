package _03_array_java.thuc_hanh;

import java.util.Scanner;

public class ReserveArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập dộ dài của mảng");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("Vượt quá length max của mảng!!");
            }
        }while (size>20);
        int[] arrayMine = new int[size];
        System.out.println("Bắt đầu nhập " + size + " element cho mảng");
        for (byte i=0; i<arrayMine.length; i++){
            System.out.println("Mời bạn nhập phần tử vị trí thứ "+ i);
            int number = scanner.nextInt();
            arrayMine[i] = number;
        }
        System.out.println("Mảng có các phần tử như dưới đây");
        for (int a: arrayMine){
            System.out.println(a);
        }
        System.out.println("Mảng sau khi được reserve");
        for (byte i=0; i< (arrayMine.length/2); i++){
            int tepm = arrayMine[i];
            arrayMine[i] = arrayMine[arrayMine.length -1 -i];
            arrayMine[arrayMine.length -1 -i] = tepm;
        }
        for (int a: arrayMine){
            System.out.println(a);
        }
    }
}

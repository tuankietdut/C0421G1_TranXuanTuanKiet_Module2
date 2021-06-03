package _03_array_java.bai_tap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] arrBegin = new int[10];
        arrBegin[0] = 10;
        arrBegin[1] = 4;
        arrBegin[2] = 6;
        arrBegin[3] = 7;
        arrBegin[4] = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vị trí muốn thay đổi: ");
        int index = scanner.nextInt();
        System.out.println("Nhập giá trị của vị trí muốn thay đổi: ");
        int number = scanner.nextInt();
        for (int i=arrBegin.length-2; i>=index; i--){
            arrBegin[i+1] = arrBegin[i];
        }
        arrBegin[index] = number;
        System.out.println("Mảng sau khi được chèn: ");
        for (int element : arrBegin){
            System.out.println(element);
        }
    }
}

package _03_array_java.bai_tap;

import java.util.Scanner;

public class TotalDiagonalSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số row cho ma trận vuông: ");
        int number = scanner.nextInt();
        int [][] arrBegin = new int[number][number];
        for (byte i=0; i<arrBegin.length; i++){
            for (byte j=0; j<arrBegin.length; j++){
                System.out.println("Nhập giá trị cho phần tử: "+ i+j);
                arrBegin[i][j] = scanner.nextInt();
            }
        }
        int total =0;
        for (byte i=0; i<arrBegin.length; i++){
            total += arrBegin[i][i];
        }
        System.out.println("Tổng đường chéo chính của ma trận: "+ total);
    }
}

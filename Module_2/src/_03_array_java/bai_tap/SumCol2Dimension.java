package _03_array_java.bai_tap;

import java.util.Scanner;

public class SumCol2Dimension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập row cho mảng 2 chiều");
        int row = scanner.nextInt();
        System.out.println("Nhập col cho mảng 2 chiều");
        int col = scanner.nextInt();
        int [][] arrBegin = new int[row][col];
        for (byte i=0; i<arrBegin.length; i++){
            for (byte j=0; j<arrBegin[i].length; j++){
                System.out.println("Nhập giá trị cho phần tử:" + i + j);
                arrBegin[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhập hàng mà bạn muốn tính tổng: ");
        int resultCol = scanner.nextInt();
        int sum =0;
        for (byte i=0; i<arrBegin.length; i++){
            sum+= arrBegin[i][resultCol];
        }
        System.out.println("Tổng giá trị của col " + resultCol + " là: "+ sum);
    }
}

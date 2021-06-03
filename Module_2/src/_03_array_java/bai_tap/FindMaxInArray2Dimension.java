package _03_array_java.bai_tap;

import java.util.Scanner;

public class FindMaxInArray2Dimension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arrayBegin = new int[2][4];
        for (byte i=0; i<arrayBegin.length; i++){
            for (byte j=0; j<arrayBegin[i].length; j++){
                System.out.println("Nhập giá trị cho phần tử: " + i + j);
                arrayBegin[i][j] = scanner.nextInt();
            }
        }
        int max = arrayBegin[0][0];
        int row =0, col =0;
        for (byte i=0; i<arrayBegin.length; i++){
            for (byte j=1; j<arrayBegin[i].length; j++){
                if (arrayBegin[i][j]>max){
                    max = arrayBegin[i][j];
                    row =i;
                    col =j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng 2 chiều: " + max+ "\nCó vị trí: "+ row + col);

    }
}

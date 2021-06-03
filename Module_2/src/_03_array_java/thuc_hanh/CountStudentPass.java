package _03_array_java.thuc_hanh;

import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng sinh viên: ");
            size = scanner.nextInt();
            if (size>30){
                System.out.println("Tối đa 30 sinh viên!!");
            }
        }while (size>30);
        int[] arr = new int[size];
        int count =0;
        for (byte i=0; i<arr.length; i++){
            System.out.println("Nhập điểm cho thí sinh thứ "+ (i+1));
            arr[i] = scanner.nextInt();
            if (arr[i]>=5 && arr[i]<=10){
                count++;
            }
        }
        System.out.println("Số lượng thí sinh pass: "+ count);
    }
}

package _03_array_java.thuc_hanh;

import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Mời bạn nhập vào chiều dài của mảng");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("Mảng tối đa 20 phần tử");
            }
        }while (size>20);
        int[] arrMoney = new int[size];
        for (byte i=0; i<arrMoney.length; i++){
            System.out.println("Mời bạn nhập giá trị cho element "+ (i+1));
            int number = scanner.nextInt();
            arrMoney[i] = number;
        }
        int max = arrMoney[0];
        int index = 0;
//        for (int element: arrMoney){
//            System.out.println(element);
//        }
        for (byte i=1; i<arrMoney.length; i++){
            if (arrMoney[i] > max){
                max = arrMoney[i];
                index = i;
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng: "+ max +"\nCó vị trí thứ: " + index);
    }
}

package _15_Exception.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class OutIndexArray {
    public Integer[] arr = new Integer[100];

    public Integer[] creatRandom() {
        Random random = new Random();
        System.out.println("Danh sách các phần tử của mảng là:");
        for (byte i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.println("Phần tử thứ " + i + " có giá trị: " + arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        OutIndexArray myArr = new OutIndexArray();
        myArr.creatRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào vị trí muốn kiểm tra:");
        int index = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử tại vị trí: " + index + " có giá trị: " + myArr.arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Vượt quá giới hạn");
        }
    }
}

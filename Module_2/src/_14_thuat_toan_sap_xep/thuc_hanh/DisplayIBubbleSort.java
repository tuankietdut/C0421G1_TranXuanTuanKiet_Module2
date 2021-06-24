package _14_thuat_toan_sap_xep.thuc_hanh;

import java.util.Scanner;

public class DisplayIBubbleSort {
    public static void main(String[] args) {
    /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input capacity of Array");
        int size = scanner.nextInt();
        int[] inputArr = new int[size];
        for (byte i = 0; i < size; i++) {
            inputArr[i] = scanner.nextInt();
        }
     */
        bubbleSortByStep(myArry);
        for (int element : myArry) {
            System.out.println(element);
        }
    }

    public static int[] myArry = {5, 7, 8, 5, 1, 2, 4, 7};

    public static void bubbleSortByStep(int[] list) {
        boolean checkSort = true;
        for (byte i = 0; i < list.length && checkSort; i++) {
            checkSort = false;
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    checkSort = true;
                    System.out.println("Element: " + list[j] + " and Element: " + list[j + 1] + " are swap");
                }
            }
            if (!checkSort) {
                System.out.println("List đã được sort");
            }
        }
    }

}

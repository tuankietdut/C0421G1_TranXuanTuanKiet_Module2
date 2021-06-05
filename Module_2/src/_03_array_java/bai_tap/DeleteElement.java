package _03_array_java.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arrBegin = {5,1,1,1,10,54,8,1};
        int index =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần tìm: ");
        int number = scanner.nextInt();
        for (byte i=0; i< arrBegin.length; i++){
            if (number == arrBegin[i]){
                for (byte j=i; j<arrBegin.length -1; j++){
                    arrBegin[j] = arrBegin[j+1];
                }
                arrBegin[arrBegin.length-1-index] =0;
                index++;
                if (arrBegin[i] == number){
                    i--;
                }
            }
        }
        for (int a: arrBegin){
//            if (a!=0){
                System.out.println(a);
//            }
        }
    }
}

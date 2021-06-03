package _03_array_java.bai_tap;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        System.out.println("Nhập ký tự để đếm: ");
        Scanner scanner = new Scanner(System.in);
        String letter = "amazing and popular";
        char chara = scanner.next().charAt(0);
        int count =0;
        for (byte i=0; i< letter.length(); i++){
            if (chara == letter.charAt(i)){
                count++;
            }
        }
        System.out.println("Có "+ count + " lần lặp");
    }
}

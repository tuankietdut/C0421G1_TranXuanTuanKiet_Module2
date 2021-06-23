package _13_thuat_toan_tim_kiem.bai_tap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StringIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi vào để so sánh");
        String variable = scanner.nextLine();
        List<Character> newString = new ArrayList<>();
        newString.add(variable.charAt(0));

        for (int j = 1; j < variable.length(); j++) {
            if (variable.charAt(j) > newString.get(newString.size() - 1)) {
                newString.add(variable.charAt(j));
            }
        }
        System.out.println(newString);
    }

}


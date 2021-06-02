package _02_loop_statement.bai_tap;

import java.util.Scanner;

public class display_20_prime {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên: ");
        String result = "||";
        byte check =0;
        for (byte i=2;check<20;i++){
            int count=0;
            for (byte j=1; j<=Math.sqrt(i); j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count ==1){
                result += i + " ";
                check++;
            }
        }
        System.out.println(result);
    }
}

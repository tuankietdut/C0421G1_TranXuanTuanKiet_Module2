package _11_Stack_Queue.optional;

import java.util.Stack;

public class TransferDecimalToBinary {
    public static int support = 0;

    public static void main(String[] args) {
        decimalToBinary(376);
        int[] myArr = {1, 0, 1, 1, 1, 1, 0, 0, 0};
        binaryToDecimal(myArr);
        decimalToHexa(923);
        hexaToDecimal("39B");
    }

    public static void decimalToBinary(int num) {
        Stack stack = new Stack();
        while (num != 0) {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        String result = "";
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        System.out.println("Chuỗi nhị phân: " + result);
    }

    public static void binaryToDecimal(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                sum = (sum * 2) + 1;
            } else {
                sum = sum * 2;
            }
        }
        System.out.println("Chuyển sang thập phân: " + sum);
    }

    public static void decimalToHexa(int num) {
        Stack stack = new Stack();
        while (num != 0) {
            int d = num % 16;
            switch (d) {
                case 0:
                    stack.push(0);
                    break;
                case 1:
                    stack.push(1);
                    break;
                case 2:
                    stack.push(2);
                    break;
                case 3:
                    stack.push(3);
                    break;
                case 4:
                    stack.push(4);
                    break;
                case 5:
                    stack.push(5);
                    break;
                case 6:
                    stack.push(6);
                    break;
                case 7:
                    stack.push(7);
                    break;
                case 8:
                    stack.push(8);
                    break;
                case 9:
                    stack.push(9);
                    break;
                case 10:
                    stack.push('A');
                    break;
                case 11:
                    stack.push('B');
                    break;
                case 12:
                    stack.push('C');
                    break;
                case 13:
                    stack.push('D');
                    break;
                case 14:
                    stack.push('E');
                    break;
                case 15:
                    stack.push('F');
                    break;
            }
            num = num / 16;
        }
        String result = "";
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        System.out.println("chuỗi thập lục phân: " + result);
    }

    public static void hexaToDecimal(String var) {
        String[] variable = var.split("");
        int sum = 0;
        int count =0;
        for (int i = variable.length-1; i >=0; i--) {
            exchange(variable[i]);
            sum += support * Math.pow(16, count++);
        }
        System.out.println("Chuỗi thập phân là: " + sum);
    }

    public static void exchange(String x) {
        switch (x) {
            case "0":
                support = 0;
                break;
            case "1":
                support = 1;
                break;
            case "2":
                support = 2;
                break;
            case "3":
                support = 3;
                break;
            case "4":
                support = 4;
                break;
            case "5":
                support = 5;
                break;
            case "6":
                support = 6;
                break;
            case "7":
                support = 7;
                break;
            case "8":
                support = 8;
                break;
            case "9":
                support = 9;
                break;
            case "A":
                support = 10;
                break;
            case "B":
                support = 11;
                break;
            case "C":
                support = 12;
                break;
            case "D":
                support = 13;
                break;
            case "E":
                support = 14;
                break;
            case "F":
                support = 15;
                break;
        }
    }
}



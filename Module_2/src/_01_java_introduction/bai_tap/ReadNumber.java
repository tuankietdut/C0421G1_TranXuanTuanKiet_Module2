package _01_java_introduction.bai_tap;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đếm: ");
        int number = scanner.nextInt();
        String  letter = "Out of number; can`t read";
        if (number < 10){
            switch (number){
                case 1:
                    letter = "one";
                    break;
                case 2:
                    letter = "two";
                    break;
                case 3:
                    letter = "three";
                    break;
                case 4:
                    letter = "four";
                    break;
                case 5:
                    letter = "five";
                    break;
                case 6:
                    letter = "six";
                    break;
                case 7:
                    letter = "seven";
                    break;
                case 8:
                    letter = "eight";
                    break;
                case 9:
                    letter = "night";
                    break;
            }
        } else if (number < 20){
            switch (number){
                case 10:
                    letter = "ten";
                    break;
                case 11:
                    letter = "eleven";
                    break;
                case 12:
                    letter = "twelve";
                    break;
                case 13:
                    letter = "thirteen";
                    break;
                case 14:
                    letter = "fourteen";
                    break;
                case 15:
                    letter = "fifteen";
                    break;
                case 16:
                    letter = "sixteen";
                    break;
                case 17:
                    letter = "seventeen";
                    break;
                case 18:
                    letter = "eighteen";
                    break;
                case 19:
                    letter = "nineteen";
                    break;
            }
        } else if (number < 100){
            int dozen = number/10;
            int unit = number - (dozen*10);
            switch (dozen){
                case 2:
                    letter = "twenty";
                    break;
                case 3:
                    letter = "thirty ";
                    break;
                case 4:
                    letter = "forty ";
                    break;
                case 5:
                    letter = "fifty ";
                    break;
                case 6:
                    letter = "sixty ";
                    break;
                case 7:
                    letter = "seventy ";
                    break;
                case 8:
                    letter = "eighty ";
                    break;
                case 9:
                    letter = "ninety ";
                    break;
            }
            switch (unit){
                case 1:
                    letter += "and one";
                    break;
                case 2:
                    letter += "and two";
                    break;
                case 3:
                    letter += "and three";
                    break;
                case 4:
                    letter += "and four";
                    break;
                case 5:
                    letter += "and five";
                    break;
                case 6:
                    letter += "and six";
                    break;
                case 7:
                    letter += "and seven";
                    break;
                case 8:
                    letter += "and eight";
                    break;
                case 9:
                    letter += "and night";
                    break;
            }
        } else if (number<1000){
            int hundred = number/100;
            int dozen = (number -(hundred*100));
            int unit = (number -(hundred*100) - (dozen*10));
            switch (hundred){
                case 1:
                    letter = "one hundred";
                    break;
                case 2:
                    letter = "two hundred";
                    break;
                case 3:
                    letter = "three hundred";
                    break;
                case 4:
                    letter = "four hundred";
                    break;
                case 5:
                    letter = "five hundred";
                    break;
                case 6:
                    letter = "six hundred";
                    break;
                case 7:
                    letter = "seven hundred";
                    break;
                case 8:
                    letter = "eight hundred";
                    break;
                case 9:
                    letter = "night hundred";
                    break;
            }
            if (dozen<20){
                switch (dozen){
                    case 10:
                        letter += " and ten";
                        unit =0;
                        break;
                    case 11:
                        letter += " and eleven";
                        unit =0;
                        break;
                    case 12:
                        letter += " and twelve";
                        unit =0;
                        break;
                    case 13:
                        letter += " and thirteen";
                        unit =0;
                        break;
                    case 14:
                        letter += " and fourteen";
                        unit =0;
                        break;
                    case 15:
                        letter += " and fifteen";
                        unit =0;
                        break;
                    case 16:
                        letter += " and sixteen";
                        unit =0;
                        break;
                    case 17:
                        letter += " and seventeen";
                        unit =0;
                        break;
                    case 18:
                        letter += " and eighteen";
                        unit =0;
                        break;
                    case 19:
                        letter += " and nineteen";
                        unit =0;
                        break;
                }
            } else {
                switch (dozen / 10) {
                    case 2:
                        letter += "and twenty";
                        break;
                    case 3:
                        letter += " and thirty ";
                        break;
                    case 4:
                        letter += " and forty ";
                        break;
                    case 5:
                        letter += " and fifty ";
                        break;
                    case 6:
                        letter += " and sixty ";
                        break;
                    case 7:
                        letter += " and seventy ";
                        break;
                    case 8:
                        letter += " and eighty ";
                        break;
                    case 9:
                        letter += " and ninety ";
                        break;
                }
            }
            switch (unit){
                case 1:
                    letter += "one";
                    break;
                case 2:
                    letter += "two";
                    break;
                case 3:
                    letter += "three";
                    break;
                case 4:
                    letter += "four";
                    break;
                case 5:
                    letter += "five";
                    break;
                case 6:
                    letter += "six";
                    break;
                case 7:
                    letter += "seven";
                    break;
                case 8:
                    letter += "eight";
                    break;
                case 9:
                    letter += "night";
                    break;
            }
    }
        System.out.println(letter);
}
}

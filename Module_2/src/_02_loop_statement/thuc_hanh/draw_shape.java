package _02_loop_statement.thuc_hanh;

import java.util.Scanner;

public class draw_shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn hình bạn muốn vẽ: ");
        System.out.println("1. Hình tam giác");
        System.out.println("2. Hình chữ nhật");
        System.out.println("3. Hình vuông");
        System.out.println("0. Exit");
        System.out.println("Input your choice");
        byte choice = scanner.nextByte();
        switch (choice){
            case 1:
                System.out.println("Nhập chiều cao cho hình tam giác");
                byte height = scanner.nextByte();
                for (byte i=0; i<height; i++){
                    for (int j=height-i; j>0;j--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Nhập chiều cao cho hình chữ nhật");
                byte heightRec = scanner.nextByte();
                System.out.println("Nhập chiều rộng cho hình chữ nhật");
                byte widthRec = scanner.nextByte();
                for (byte i=0; i<heightRec; i++){
                    if (i==0 || i==(heightRec-1)){
                        for (byte j=0; j<widthRec; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }else {
                        for (byte j=0; j<widthRec; j++){
                            if (j==0 || j==(widthRec-1)) {
                                System.out.print("*");
                            }else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                }
                break;
            case 3:
                System.out.println("Nhập chiều cao cho hình vuông");
                byte heightSquare = scanner.nextByte();
                for (byte i=0; i<heightSquare; i++){
                    for (byte j=0; j<heightSquare; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("No choice!!!");
        }
    }
}

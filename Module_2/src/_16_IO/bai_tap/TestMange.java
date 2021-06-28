package _16_IO.bai_tap;

import java.util.List;
import java.util.Scanner;

public class TestMange {
    public static void main(String[] args) {
        NationManagement nationManagement = new NationManagement();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Chương trình với 2 chức năng");
            System.out.println("1. Nhập dữ liệu các quốc gia vào");
            System.out.println("2. Xuất dữ liệu ra cho người dùng xem!!!");
            System.out.println("3. out khoi ctrinfh");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Mời nhập các thông tin cho Nation");
                    System.out.println("Nhập id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập code");
                    String code = scanner.nextLine();
                    System.out.println("Nhập name");
                    String name = scanner.nextLine();
                    Nation nation1 = new Nation(id, code, name);
                    nationManagement.writerFile(nation1);
                    break;
                case 2:
                    List<Nation> list = nationManagement.readFile();
                    for (Nation element: list){
                        System.out.println(element.toString());
                    }
                    break;
                case 3:
                    System.exit(3);
            }
        }
    }
}

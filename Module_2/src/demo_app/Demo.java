package demo_app;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("------------Chương trình quản lý sinh viên------------");
        Scanner scanner = new Scanner(System.in);
        String[] arrStudent = new String[50];
        while (true){
            System.out.println("Menu chương trình: ");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Chỉnh sửa thông tin sinh viên");
            System.out.println("4. Thêm mới sinh viên");
            System.out.println("5. Thoát chương trình");
            System.out.println("Chọn chức năng muốn sử dụng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    for (String element: arrStudent){
                        if (element != null){
                            System.out.println(element);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhập tên sinh viên muốn xóa");
                    String deleteStudent = scanner.nextLine();
                    boolean check = false;
                    byte index =0;
                    for (byte i=0; i<arrStudent.length; i++){
                        if (deleteStudent.equals(arrStudent[i])){
                            check = true;
                            index = i;
                            break;
                        }
                    }
                    if (check){
                        System.out.println("Đã xóa "+ arrStudent[index]+" khỏi danh sách!!");
                        arrStudent[index] = null;
                    }else {
                        System.out.println("Không có tên sinh viên này trong danh sách");
                    }
                    break;
                case 3:
                    System.out.println("Nhập tên sinh viên muốn sửa");
                    String editStudent = scanner.nextLine();
                    for (byte i=0; i<arrStudent.length; i++){
                        if (editStudent.equals(arrStudent[i])){
                            System.out.println("Bạn muốn sửa tên sinh viên thành tên gì: ");
                            arrStudent[i] = scanner.nextLine();
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập tên sinh viên muốn thêm");
                    String addStudent = scanner.nextLine();
                    for (byte i=0; i<arrStudent.length; i++){
                        if (arrStudent[i] == null){
                            arrStudent[i] = addStudent;
                            break;
                        }
                    }
                    break;
                case 5:
                    System.exit(5);
                    break;
                default:
                    System.out.println("Mời người dùng nhập lại!!");
            }
        }
    }
}

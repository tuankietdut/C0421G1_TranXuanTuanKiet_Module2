package demo_app;

import java.util.Scanner;

public class Demo {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("------------Chương trình quản lý sinh viên------------");
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
                    displayStudent(arrStudent);
                    break;
                case 2:
                    deleteStudent(arrStudent);
                    break;
                case 3:
                    editStudent(arrStudent);
                    break;
                case 4:
                    addStudent(arrStudent);
                    break;
                case 5:
                    System.exit(5);
                    break;
                default:
                    System.out.println("Mời người dùng nhập lại!!");
            }
        }
    }
    private static void displayStudent(String[] arrStudent){
        for (String element: arrStudent){
            if (element != null){
                System.out.println(element);
            }
        }
    }
    private static void deleteStudent(String[] arrStudent){
        String deleteStudent = inputStudent("Nhập tên sinh viên muốn xóa");
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
    }
    private static void editStudent(String []arrStudent){
        String editStudent = inputStudent("Nhập tên sinh viên muốn sửa");
        for (byte i=0; i<arrStudent.length; i++){
            if (editStudent.equals(arrStudent[i])){
                System.out.println("Bạn muốn sửa tên sinh viên thành tên gì: ");
                arrStudent[i] = scanner.nextLine();
                break;
            }
        }
    }
    private static void addStudent(String []arrStudent){
        String addStudent = inputStudent("Nhập tên sinh viên muốn thêm");
        for (byte i=0; i<arrStudent.length; i++){
            if (arrStudent[i] == null){
                arrStudent[i] = addStudent;
                break;
            }
        }
    }
    private static String inputStudent(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}

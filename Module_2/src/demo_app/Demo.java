package demo_app;

import java.util.Scanner;

public class Demo {
    private static Person[] arrStudent;
    static {
        arrStudent = new Person[50];
        arrStudent[0] = new Student(1, "Nam", 21, "Nghê An","C0421G1");
        arrStudent[1] = new Student(2, "Nữ", 22, "Thanh Hóa","C0421G1");
        arrStudent[2] = new Student(3, "Trung tính", 23, "Vinh","C0421G1");
        arrStudent[3] = new Student(4, "Hoàng", 24, "Quảng Nam","C0421G1");
        arrStudent[4] = new Teacher(5, "Mai", 25, "Đà Nẵng","Engineer");
        arrStudent[5] = new Teacher(6, "Thảo", 21, "Quảng Ngãi","Master");
    }
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("------------Chương trình quản lý sinh viên------------");
        while (true){
            System.out.println("Menu chương trình: ");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Chỉnh sửa thông tin sinh viên");
            System.out.println("4. Thêm mới sinh viên");
            System.out.println("5. Thêm mới giáo viên");
            System.out.println("6. Xem danh sách giáo viên");
            System.out.println("7. Thoát chương trình");
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
                    addTeacher(arrStudent);
                    break;
                case 6:
                    displayTeacher(arrStudent);
                    break;
                case 7:
                    System.exit(5);
                    break;
                default:
                    System.out.println("Mời người dùng nhập lại!!");
            }
        }
    }
    private static void displayStudent(Person[] arrStudent){
        for (Person element: arrStudent){
            if (element instanceof Student){
                System.out.println(element.toString());
                ((Student)element).study();
            }
        }
    }
    private static void displayTeacher(Person[] arrStudent){
        for (Person element: arrStudent){
            if (element instanceof Teacher){
                System.out.println(element.toString());
            }
        }
    }
    private static void deleteStudent(Person[] arrStudent){
        int deleteStudent = Integer.parseInt(inputStudent("Nhập id muốn xóa"));
        boolean check = false;
        byte index =0;
        for (byte i=0; i<arrStudent.length; i++){
            if (deleteStudent == arrStudent[i].getId()){
                check = true;
                index = i;
                break;
            }
        }
        if (check){
            System.out.println("Đã xóa "+ arrStudent[index].getName()+" khỏi danh sách!!");
            arrStudent[index] = null;
        }else {
            System.out.println("Không có sinh viên này trong danh sách");
        }
    }
    private static void editStudent(Person[]arrStudent){
        int editStudent = Integer.parseInt(inputStudent("Nhập id của sinh viên muốn sửa"));
        for (byte i=0; i<arrStudent.length; i++){
            if (editStudent == arrStudent[i].getId()){
                System.out.println("Bạn muốn giá trị nào trong đối tượng sinh viên này: ");
                System.out.println("1. Sửa id");
                System.out.println("2.Sửa name");
                System.out.println("3.Sửa age");
                System.out.println("4. Sửa address");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose){
                    case 1:
                        System.out.println("Mời nhập id");
                        arrStudent[i].setId(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Id đã được thay đổi");
                        break;
                    case 2:
                        System.out.println("Mời nhập tên");
                        arrStudent[i].setName(scanner.nextLine());
                        System.out.println("Name đã được thay đổi");
                        break;
                    case 3:
                        System.out.println("Mời nhập tuổi");
                        arrStudent[i].setAge(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Age đã được thay đổi");
                        break;
                    case 4:
                        System.out.println("Mời nhập địa chỉ");
                        arrStudent[i].setAddress(scanner.nextLine());
                        System.out.println("Address đã được thay dổi");
                        break;
                }
                break;
            }
        }
    }
    private static void addStudent(Person[] arrStudent){
        int id = Integer.parseInt(inputStudent("Nhập id"));
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập lớp học");
        String classStudent = scanner.nextLine();
        for (byte i=0; i<arrStudent.length; i++){
            if (arrStudent[i] == null){
                arrStudent[i] = new Student(id, name, age, address,classStudent);
                break;
            }
        }
    }
    private static void addTeacher(Person[] arrStudent){
        int id = Integer.parseInt(inputStudent("Nhập id"));
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập level");
        String level = scanner.nextLine();
        for (byte i=0; i<arrStudent.length; i++){
            if (arrStudent[i] == null){
                arrStudent[i] = new Teacher(id, name, age, address, level);
                break;
            }
        }
    }
    private static String inputStudent(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}

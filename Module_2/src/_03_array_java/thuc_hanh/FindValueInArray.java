package _03_array_java.thuc_hanh;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] arrNameStudents = {"Trung", "Dũng", "Nga", "Chiến", "Thu", "Tiên"};
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên muốn tìm kiếm trong mảng: ");
        String nameStu = scanner.nextLine();
        for (byte i=0; i<arrNameStudents.length; i++){
            if (nameStu.equals(arrNameStudents[i])){
                System.out.println("Có "+ nameStu + " trong mảng \nCó vị trí thứ: "+ ++i);
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Không có "+ nameStu + " trong mảng");
        }
    }
}

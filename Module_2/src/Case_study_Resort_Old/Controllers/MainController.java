package Case_study_Resort_Old.Controllers;

import Case_study_Resort_Old.Models.House;
import Case_study_Resort_Old.Models.Room;
import Case_study_Resort_Old.Models.Villa;

import java.io.*;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        new MainController().displayMainMenu();
    }

    public static Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        boolean loopCheck = true;
        while (loopCheck) {
            System.out.println("Menu of Resort");
            System.out.println("1. Add New Services");
            System.out.println("2. Show Services");
            System.out.println("3. Add New Customer");
            System.out.println("4. Show Information of Customer");
            System.out.println("5. Add New Booking");
            System.out.println("6. Show Information of Employee");
            System.out.println("7. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNewService();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    loopCheck = false;
                    break;
            }
        }
    }

    public void addNewService() {
        while (true) {
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to menu");
            System.out.println("5. Exit");
            String nameService = null;
            String areaService = null;
            int rentalPrice = 0;
            int numberPeople = 0;
            String styleRental = null;
            String id = null;
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice != 4){
                System.out.println("Nhập tên dịch vụ: ");
                 nameService = scanner.nextLine();
                System.out.println("Diện tích của dịch vụ sử dụng:");
                 areaService = scanner.nextLine();
                System.out.println("Giá thuê của dịch vụ");
                 rentalPrice = Integer.parseInt(scanner.nextLine());
                System.out.println("Số lượng người ở cho dịch vụ này");
                 numberPeople = Integer.parseInt(scanner.nextLine());
                System.out.println("Kiểu thuê(ngày - tháng - năm)");
                 styleRental = scanner.nextLine();
                System.out.println("Nhập id cho service:");
                 id = scanner.nextLine();
            }
            switch (choice) {
                case 1:
                    System.out.println("Nhập tiêu chuẩn của Villa");
                    String standardVilla = scanner.nextLine();
                    System.out.println("Mô tả tiện nghi khác của phòng");
                    String describeVilla = scanner.nextLine();
                    System.out.println("Diện tích hồ bơi");
                    String areaPool = scanner.nextLine();
                    System.out.println("Số tầng ");
                    int number = Integer.parseInt(scanner.nextLine());
                    Villa villa = new Villa(nameService, areaService, rentalPrice, numberPeople, styleRental, id,
                            standardVilla, describeVilla, areaPool, number);
                    try {
                        ObjectOutputStream objectInputStream = new ObjectOutputStream(new FileOutputStream("src\\Case_study_Resort\\Data\\villa.csv"));
                        objectInputStream.writeObject(villa);
                        objectInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("Nhập tiêu chuẩn của House");
                    String standardHouse = scanner.nextLine();
                    System.out.println("Mô tả tiện nghi khác của phòng");
                    String describeHouse = scanner.nextLine();
                    System.out.println("Số tầng ");
                    int numberFloor = Integer.parseInt(scanner.nextLine());
                    House house = new House(nameService, areaService, rentalPrice, numberPeople, styleRental, id,
                            standardHouse, describeHouse, numberFloor);
                    try {
                        ObjectOutputStream objectInputStream = new ObjectOutputStream(new FileOutputStream("src\\Case_study_Resort\\Data\\house.csv"));
                        objectInputStream.writeObject(house);
                        objectInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Nhập các dịch vụ đi kèm miễn phí của Room");
                    String freeService = scanner.nextLine();
                    Room room = new Room(nameService, areaService, rentalPrice, numberPeople, styleRental, id, freeService);
                    try {
                        ObjectOutputStream objectInputStream = new ObjectOutputStream(new FileOutputStream("src\\Case_study_Resort\\Data\\room.csv"));
                        objectInputStream.writeObject(room);
                        objectInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

}

package Case_study_new.services.class_service;

import Case_study_new.models.Facility;
import Case_study_new.models.House;
import Case_study_new.models.Room;
import Case_study_new.models.Villa;
import Case_study_new.services.FacilityService;

import java.util.*;

public class FacilityServiceImpl implements FacilityService<Facility> {
    private static Scanner scanner = new Scanner(System.in);

    private static Map<Facility, Integer> myMap = new LinkedHashMap<>();

    static {
        myMap.put(new Villa("VL0001", 45, 60, 10,
                "Theo ngày", "tiêu chuẩn quốc tế", 15, 3), 5);
        myMap.put(new House("HO0001", 30, 60, 10,
                "Theo ngày", "tiêu chuẩn quốc tế", 2), 5);
        myMap.put(new Room("R0001", 20, 50, 5, "Theo tháng",
                "Các dịch vụ free như xem phim, nghe nhạc"), 3);
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : myMap.entrySet()) {
            System.out.println("Service"+ element.getKey() + " số lần sử dụng: "+ element.getValue());
        }
    }

    @Override
    public void add() {
        while (true) {
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to menu");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (RuntimeException ex) {
                ex.printStackTrace();
            }
            switch (choice) {
                case 1:
                    try {
                        addVilla();
                    } catch (RuntimeException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        addHouse();
                    } catch (RuntimeException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        addRoom();
                    } catch (RuntimeException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 4:
                    return;
            }
        }

    }

    @Override
    public Map<Facility, Integer> getList() {
       return myMap;

    }


    @Override
    public void edit() {

    }

    @Override
    public void displayFacMaintain() {
        for (Map.Entry<Facility, Integer> entry : myMap.entrySet()) {
            Facility key = entry.getKey();
            int value = entry.getValue();
            if (value >= 5) {
                System.out.println(key.toString());
            }
        }

    }

    private static void addVilla() throws RuntimeException {
        System.out.println("Nhập id của Villa");
        String idVilla = scanner.nextLine();
        System.out.println("1. Nhập diện tích của Villa");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("2. Giá cho thuê");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("3. Số lượng người thuê tối đa cho 1 Villa");
        int rentalPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("4. Thuê theo ngày/giờ/tháng");
        String styleRental = scanner.nextLine();
        System.out.println("5. Tiêu chuẩn của phòng");
        String standardVilla = scanner.nextLine();
        System.out.println("6. Diện tích hồ bơi");
        double areaPool = Double.parseDouble(scanner.nextLine());
        System.out.println("7. Số tầng");
        int floor = Integer.parseInt(scanner.nextLine());
        myMap.put(new Villa(idVilla, areaUse, price, rentalPeople, styleRental, standardVilla, areaPool, floor), null);
    }
    // House double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardHose, int floor

    private static void addHouse() throws RuntimeException {
        System.out.println("Nhập id của House");
        String idHouse = scanner.nextLine();
        System.out.println("1. Nhập diện tích của House");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("2. Giá cho thuê");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("3. Số lượng người thuê tối đa cho 1 House");
        int rentalPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("4. Thuê theo ngày/giờ/tháng");
        String styleRental = scanner.nextLine();
        System.out.println("5. Tiêu chuẩn của phòng");
        String standardVilla = scanner.nextLine();
        System.out.println("6. Số tầng");
        int floor = Integer.parseInt(scanner.nextLine());
        myMap.put(new House(idHouse, areaUse, price, rentalPeople, styleRental, standardVilla, floor), null);
    }

    //Room double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String freeService

    private static void addRoom() throws RuntimeException {
        System.out.println("Nhập id của Room");
        String idRoom = scanner.nextLine();
        System.out.println("1. Nhập diện tích của Room");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("2. Giá cho thuê");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("3. Số lượng người thuê tối đa cho 1 Room");
        int rentalPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("4. Thuê theo ngày/giờ/tháng");
        String styleRental = scanner.nextLine();
        System.out.println("5. Các dịch vụ miễn phí");
        String freeService = scanner.nextLine();
        myMap.put(new Room(idRoom, areaUse, price, rentalPeople, styleRental, freeService), null);
    }
}

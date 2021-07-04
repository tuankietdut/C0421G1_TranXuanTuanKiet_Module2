package Case_study_new.services.class_service;

import Case_study_new.models.*;
import Case_study_new.services.FacilityService;
import Case_study_new.utils.ReadAndWriteFacility;
import Case_study_new.utils.class_ReadAndWrite.ReadAndWriteBookingImp;
import Case_study_new.utils.class_ReadAndWrite.ReadAndWriteFacilityImp;

import java.util.*;

public class FacilityServiceImpl implements FacilityService<Facility> {
    private static Scanner scanner = new Scanner(System.in);

    private static Map<Facility, Integer> myMap = new LinkedHashMap<>();

//    static {
//        myMap.put(new Villa("VL0001", 45, 60, 10,
//                "Theo ngày", "tiêu chuẩn quốc tế", 15, 3), 5);
//        myMap.put(new House("HO0001", 30, 60, 10,
//                "Theo ngày", "tiêu chuẩn quốc tế", 2), 5);
//        myMap.put(new Room("R0001", 20, 50, 5, "Theo tháng",
//                "Các dịch vụ free như xem phim, nghe nhạc"), 3);
//    }

    @Override
    public void display() {
        myMap.putAll(new ReadAndWriteFacilityImp().readFile("src\\Case_study_new\\data\\villa.csv"));
        myMap.putAll(new ReadAndWriteFacilityImp().readFile("src\\Case_study_new\\data\\house.csv"));
        myMap.putAll(new ReadAndWriteFacilityImp().readFile("src\\Case_study_new\\data\\room.csv"));
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
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
            switch (choice) {
                case 1:
                    try {
                        addVilla(new ReadAndWriteFacilityImp());
                    } catch (RuntimeException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        addHouse(new ReadAndWriteFacilityImp());
                    } catch (RuntimeException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        addRoom(new ReadAndWriteFacilityImp());
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
        myMap.putAll(new ReadAndWriteFacilityImp().readFile("src\\Case_study_new\\data\\villa.csv"));
        myMap.putAll(new ReadAndWriteFacilityImp().readFile("src\\Case_study_new\\data\\house.csv"));
        myMap.putAll(new ReadAndWriteFacilityImp().readFile("src\\Case_study_new\\data\\room.csv"));
        return myMap;
    }


    @Override
    public void edit() {
        // Không có method này trong menu , implements hơi sai, nhưng nhát sửa
    }

    @Override
    public void displayFacMaintain() {
        myMap.putAll(new ReadAndWriteFacilityImp().readFile("src\\Case_study_new\\data\\villa.csv"));
        myMap.putAll(new ReadAndWriteFacilityImp().readFile("src\\Case_study_new\\data\\house.csv"));
        myMap.putAll(new ReadAndWriteFacilityImp().readFile("src\\Case_study_new\\data\\room.csv"));
        for (Map.Entry<Facility, Integer> entry : myMap.entrySet()) {
            Facility key = entry.getKey();
            int value = entry.getValue();
            if (value >= 5) {
                System.out.println(key.toString());
            }
        }
    }

    private static void addVilla(ReadAndWriteFacility readAndWriteFacility) throws NumberFormatException {
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
        readAndWriteFacility.writeFile("src\\Case_study_new\\data\\villa.csv",myMap);
    }
    // House double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardHose, int floor

    private static void addHouse(ReadAndWriteFacility readAndWriteFacility) throws NumberFormatException {
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
        readAndWriteFacility.writeFile("src\\Case_study_new\\data\\house.csv",myMap);
    }

    //Room double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String freeService

    private static void addRoom(ReadAndWriteFacility readAndWriteFacility) throws NumberFormatException {
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
        readAndWriteFacility.writeFile("src\\Case_study_new\\data\\room.csv",myMap);
    }
}

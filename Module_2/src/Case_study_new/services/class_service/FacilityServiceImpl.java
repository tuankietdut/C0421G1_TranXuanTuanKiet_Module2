package Case_study_new.services.class_service;

import Case_study_new.models.*;
import Case_study_new.services.FacilityService;
import Case_study_new.utils.ReadAndWriteFacility;
import Case_study_new.utils.class_ReadAndWrite.ReadAndWriteFacilityImp;

import java.io.File;
import java.util.*;

public class FacilityServiceImpl implements FacilityService<Facility> {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<Facility, Integer> myMap = new LinkedHashMap<>();//VL1, H1, R1, VL2
    private static Map<Facility, Integer> mapVilla = new LinkedHashMap<>();
    private static Map<Facility, Integer> mapHouse = new LinkedHashMap<>();
    private static Map<Facility, Integer> mapRoom = new LinkedHashMap<>();

    static {
        runMap();
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : myMap.entrySet()) {
            System.out.println("Service" + element.getKey() + " số lần sử dụng: " + element.getValue());
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
                    addVilla(new ReadAndWriteFacilityImp());
                    break;
                case 2:
                    addHouse(new ReadAndWriteFacilityImp());
                    break;
                case 3:
                    addRoom(new ReadAndWriteFacilityImp());
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

    private static void runMap() {
        mapVilla = new ReadAndWriteFacilityImp().readFile("src\\Case_study_new\\data\\villa.csv");
        mapHouse = new ReadAndWriteFacilityImp().readFile("src\\Case_study_new\\data\\house.csv");
        mapRoom = new ReadAndWriteFacilityImp().readFile("src\\Case_study_new\\data\\room.csv");
        myMap.putAll(mapVilla);
        myMap.putAll(mapHouse);
        myMap.putAll(mapRoom);
    }

    @Override
    public void edit() {
        // Không có method này trong menu , implements hơi sai, nhưng nhát sửa
    }

    @Override
    public void displayFacMaintain() {
        boolean maintainFac = false;
        for (Map.Entry<Facility, Integer> entry : myMap.entrySet()) {
            Facility key = entry.getKey();
            int value = entry.getValue();
            if (value >= 5) {
                System.out.println(key.toString());
                maintainFac = true;
            }
        }
        if (!maintainFac) {
            System.out.println("Không có Facility cần bảo trì");
        }
    }

    private static boolean checkFile(String path) {
        File file = new File(path);
        return file.exists();
    }

    private static void addVilla(ReadAndWriteFacility readAndWriteFacility) {
        if (checkFile("src\\Case_study_new\\data\\villa.csv")) {
            mapVilla = readAndWriteFacility.readFile("src\\Case_study_new\\data\\villa.csv");
        }
        boolean checkVilla = true;
        while (checkVilla) {
            try {
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
                Villa villa = new Villa(idVilla, areaUse, price, rentalPeople, styleRental, standardVilla, areaPool, floor);
                mapVilla.put(villa, 0);
                myMap.put(villa, 0);
                readAndWriteFacility.writeFile("src\\Case_study_new\\data\\villa.csv", mapVilla);
                checkVilla = false;
            } catch (RuntimeException ex) {
                System.out.println("Nhập đúng dữ liệu cho Villa");
            }
        }

    }
    // House double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardHose, int floor

    private static void addHouse(ReadAndWriteFacility readAndWriteFacility) {
        if (checkFile("src\\Case_study_new\\data\\house.csv")) {
            mapHouse = readAndWriteFacility.readFile("src\\Case_study_new\\data\\house.csv");
        }
        boolean checkHouse = true;
        while (checkHouse) {
            try {
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
                House house = new House(idHouse, areaUse, price, rentalPeople, styleRental, standardVilla, floor);
                mapHouse.put(house, 0);
                myMap.put(house, 0);
                readAndWriteFacility.writeFile("src\\Case_study_new\\data\\house.csv", mapHouse);
                checkHouse = false;
            } catch (RuntimeException ex) {
                System.out.println("Nhập đúng dữ liệu cho House");
            }
        }
    }

    //Room double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String freeService

    private static void addRoom(ReadAndWriteFacility readAndWriteFacility) {
        if (checkFile("src\\Case_study_new\\data\\room.csv")) {
            mapRoom = readAndWriteFacility.readFile("src\\Case_study_new\\data\\room.csv");
        }
        boolean checkRoom = true;
        while (checkRoom) {
            try {
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
                Room room = new Room(idRoom, areaUse, price, rentalPeople, styleRental, freeService);
                mapRoom.put(room, 0);
                myMap.put(room, 0);
                readAndWriteFacility.writeFile("src\\Case_study_new\\data\\room.csv", mapRoom);
                checkRoom = false;
            } catch (RuntimeException ex) {
                System.out.println("Nhập đúng dữ liệu cho Room");
            }
        }
    }
}

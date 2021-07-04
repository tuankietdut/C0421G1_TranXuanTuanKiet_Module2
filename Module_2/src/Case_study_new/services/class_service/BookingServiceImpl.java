package Case_study_new.services.class_service;

import Case_study_new.libs.BookingComparator;
import Case_study_new.models.*;
import Case_study_new.services.BookingService;
import Case_study_new.utils.ReadAndWriteBooking;
import Case_study_new.utils.class_ReadAndWrite.ReadAndWriteFacilityImp;

import java.util.*;

public class BookingServiceImpl implements BookingService {

    private static Scanner scanner = new Scanner(System.in);

    private static Set<Booking> myTree = new TreeSet<>(new BookingComparator()); //

    @Override
    public void displayListBooking(ReadAndWriteBooking readAndWrite) {
        for (Booking element: readAndWrite.readFile("src\\Case_study_new\\data\\booking.csv")){
            System.out.println(element.toString());
        }
    }

    @Override
    public void addBooking(ReadAndWriteBooking readAndWrite) {
        System.out.println("Danh sách customer");
        new CustomerServiceImpl().display();
        System.out.println("Danh sách facility ");
        new FacilityServiceImpl().display();
        System.out.println("Nhập id của lượt booking này");
        String idBooking = scanner.nextLine();
        System.out.println("Ngày bắt đầu booking");
        String startDate = scanner.nextLine();
        System.out.println("Ngày kết thúc");
        String endDate = scanner.nextLine();
        System.out.println("Nhập id của customer");
        String idCus = scanner.nextLine();
        Customer customer = null;
        for (Customer element : new CustomerServiceImpl().getList()) {
            if (element.getIdCode().equals(idCus)) {
                customer = element;
                break;
            }
        }
        System.out.println("Nhập id của mã dịch vụ");
        String idFac = scanner.nextLine();
        Facility facility = null;
        for (Facility element : new FacilityServiceImpl().getList().keySet()) {
            if (element.getIdFacility().equals(idFac)) {
                int newValue = new FacilityServiceImpl().getList().get(element) +1;
                if (element instanceof Villa){
                    Map<Facility, Integer> myMap = new ReadAndWriteFacilityImp().readFile("src\\Case_study_new\\data\\villa.csv");
                    myMap.put(element, newValue);
                    new ReadAndWriteFacilityImp().writeFile("src\\Case_study_new\\data\\villa.csv", myMap);
                }
                if (element instanceof House){
                    Map<Facility, Integer> myMap = new ReadAndWriteFacilityImp().readFile("src\\Case_study_new\\data\\house.csv");
                    myMap.put(element, newValue);
                    new ReadAndWriteFacilityImp().writeFile("src\\Case_study_new\\data\\house.csv", myMap);
                }
                if (element instanceof Room){
                    Map<Facility, Integer> myMap = new ReadAndWriteFacilityImp().readFile("src\\Case_study_new\\data\\room.csv");
                    myMap.put(element, newValue);
                    new ReadAndWriteFacilityImp().writeFile("src\\Case_study_new\\data\\room.csv", myMap);
                }
            }
        }
        Booking booking = new Booking(idBooking, startDate, endDate, customer, facility);
        myTree.add(booking);
        readAndWrite.writeFile("src\\Case_study_new\\data\\booking.csv",myTree);
//        new ReadAndWriteCollection<Booking>().writeCollection("src\\Case_study_new\\data\\booking.csv",myTree);
    }
}

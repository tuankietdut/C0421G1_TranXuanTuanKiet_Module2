package Case_study_new.services.class_service;

import Case_study_new.libs.BookingComparator;
import Case_study_new.models.Booking;
import Case_study_new.models.Customer;
import Case_study_new.models.Facility;
import Case_study_new.services.BookingService;
import Case_study_new.utils.ReadAndWrite;
import Case_study_new.utils.ReadAndWriteBooking;

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
                facility = element;
                int newValue = new FacilityServiceImpl().getList().get(facility) +1;
                new FacilityServiceImpl().getList().put(facility, newValue);
            }
        }
        Booking booking = new Booking(idBooking, startDate, endDate, customer, facility);
        myTree.add(booking);
        readAndWrite.writeFile("src\\Case_study_new\\data\\booking.csv",myTree);
//        new ReadAndWriteCollection<Booking>().writeCollection("src\\Case_study_new\\data\\booking.csv",myTree);
    }
}

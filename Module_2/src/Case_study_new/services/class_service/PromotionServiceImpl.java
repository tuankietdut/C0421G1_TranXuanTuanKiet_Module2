package Case_study_new.services.class_service;

import Case_study_new.libs.BookingComparator;
import Case_study_new.libs.PromotionComparator;
import Case_study_new.models.Booking;
import Case_study_new.models.Customer;
import Case_study_new.services.PromotionService;
import Case_study_new.utils.class_ReadAndWrite.ReadAndWriteBookingImp;

import java.util.*;

public class PromotionServiceImpl implements PromotionService {
    public static void main(String[] args) {
        new PromotionServiceImpl().display();
    }

    private static Set<CustomerList> customerListSet = new TreeSet<>();

    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        TreeSet<Booking> treeSet = (TreeSet<Booking>) new ReadAndWriteBookingImp().readFile("src\\Case_study_new\\data\\booking.csv");
        for (Booking element : treeSet) {
            System.out.println("Tên của customer " + element.getCustomer().getNamePerson());
            System.out.println("Id của customer: " + element.getCustomer().getIdCode());
            System.out.println("Nhập vào số năm của customer sử dụng dịch vụ: ");
            int year = Integer.parseInt(scanner.nextLine());
            customerListSet.add(new CustomerList(element.getCustomer(), year));
        }
        for (CustomerList element : customerListSet)
            System.out.println(element);
    }

    @Override
    public void listGetVoucher() {

    }

    private class CustomerList implements Comparable<CustomerList> {
        private Customer customer;
        private int year;

        public CustomerList() {
        }

        public CustomerList(Customer customer, int year) {
            this.customer = customer;
            this.year = year;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public int compareTo(CustomerList o) {
            return this.getYear() - o.getYear();
        }

        @Override
        public String toString() {
            return "CustomerList{" +
                    "customer=" + customer +
                    ", year=" + year +
                    '}';
        }
    }
}

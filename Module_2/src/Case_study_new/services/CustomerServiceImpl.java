package Case_study_new.services;

import Case_study_new.models.Customer;
import Case_study_new.models.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customers = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        Customer customer1 = new Customer("CU0001", "Trần Xuân Đông", "12/03/1995", "Male", "011821570",
                "09052614577", "txtkdc@gmail.com", "Platinium", "Đà Nẵng");
        Customer customer2 = new Customer("CU0002", "Trần Xuân Hạ", "12/03/1996", "Female", "011821578",
                "09052614477", "txtkdc@gmail.com", "Gold", "Vinh");
        Customer customer3 = new Customer("CU0003", "Trần Xuân Thu", "12/03/1997", "Female", "014521570",
                "09052614477", "txtkdc@gmail.com", "Silver", "Huế");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
    }
    //String idCode, String namePerson, String dateOfBirth, String sex, String idPerson
    // , String phoneNumber, String emailAddress, String typeCustomer, String address

    public static void displayCustomer() {
        for (Customer element : customers) {
            System.out.println(element.toString());
        }
    }

    public static void addCustomer() {
        System.out.println("0. Mã số của khách hàng");
        String idCustom = scanner.nextLine();
        System.out.println("1. Name customer");
        String nameCustomers = scanner.nextLine();
        System.out.println("2. Ngày sinh");
        String day = scanner.nextLine();
        System.out.println("3. Giới tính");
        String sex = scanner.nextLine();
        System.out.println("4. Số Chứng minh nhân dân");
        String idPerson = scanner.nextLine();
        System.out.println("5. Số điện thoại");
        String number = scanner.nextLine();
        System.out.println("6. Địa chỉ email");
        String email = scanner.nextLine();
        System.out.println("7. Loại khách hàng");
        String typeCustomer = scanner.nextLine();
        System.out.println("8. Địa chỉ");
        String address = scanner.nextLine();
        Customer element = new Customer(idCustom, nameCustomers, day, sex, idPerson, number, email, typeCustomer, address);
        customers.add(element);
    }

    public static void editCustomer(String idCode) {
        boolean checkCustomer = false;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getIdCode().equals(idCode)) {
                checkCustomer = true;
                System.out.println("Bạn muốn sửa thông tin nào cho " + customers.get(i).getNamePerson());
                System.out.println("1. Name employee");
                System.out.println("2. Ngày sinh");
                System.out.println("3. Giới tính");
                System.out.println("4. Số Chứng minh nhân dân");
                System.out.println("5. Số điện thoại");
                System.out.println("6. Địa chỉ email");
                System.out.println("7. Loại khách hàng");
                System.out.println("8. Địa chỉ của khách hàng");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Nhập tên muốn sửa");
                        String name = scanner.nextLine();
                        customers.get(i).setNamePerson(name);
                        break;
                    case 2:
                        System.out.println("Nhập dateOfBirth");
                        String day = scanner.nextLine();
                        customers.get(i).setDateOfBirth(day);
                        break;
                    case 3:
                        System.out.println("Nhập giới tính");
                        String sex = scanner.nextLine();
                        customers.get(i).setDateOfBirth(sex);
                        break;
                    case 4:
                        System.out.println("Nhập CMND");
                        String idPerson = scanner.nextLine();
                        customers.get(i).setIdPerson(idPerson);
                        break;
                    case 5:
                        System.out.println("Nhập số điện thoại");
                        String number = scanner.nextLine();
                        customers.get(i).setPhoneNumber(number);
                        break;
                    case 6:
                        System.out.println("Nhập emailAddress");
                        String email = scanner.nextLine();
                        customers.get(i).setEmailAddress(email);
                        break;
                    case 7:
                        System.out.println("Nhập loại khách hàng");
                        String typeCustomer = scanner.nextLine();
                        customers.get(i).setTypeCustomer(typeCustomer);
                        break;
                    case 8:
                        System.out.println("Nhập địa chỉ của khách hàng");
                        String address = scanner.nextLine();
                        customers.get(i).setAddress(address);
                        break;
                }
            }
        }
        if (checkCustomer) {
            System.out.println("Hoàn thành việc cập nhật");
        } else {
            System.out.println("Không có id này trong list Employees");
        }
    }

}

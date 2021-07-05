package Case_study_new.services.class_service;

import Case_study_new.models.Customer;
import Case_study_new.models.Employee;
import Case_study_new.services.CustomerService;
import Case_study_new.utils.ReadAndWrite;
import Case_study_new.utils.ReadAndWriteCustomer;
import Case_study_new.utils.class_ReadAndWrite.ReadAndWriteCustomerImp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customers = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer element : new ReadAndWriteCustomerImp().readFile("src\\Case_study_new\\data\\customer.csv")) {
            System.out.println(element.toString());
        }
    }

    @Override
    public void add() {
        customers = (List<Customer>) new ReadAndWriteCustomerImp().readFile("src\\Case_study_new\\data\\customer.csv");
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
        new ReadAndWriteCustomerImp().writeFile("src\\Case_study_new\\data\\customer.csv",customers);
    }

    @Override
    public void edit() {
        customers = (List<Customer>) new ReadAndWriteCustomerImp().readFile("src\\Case_study_new\\data\\customer.csv");
        System.out.println("Nhập id của customer cần edit");
        String idCode = scanner.nextLine();
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
            new ReadAndWriteCustomerImp().writeFile("src\\Case_study_new\\data\\customer.csv",customers);
        } else {
            System.out.println("Không có id này trong list Employees");
        }
    }

    //Sử dụng getList để lấy danh sách customer phục vụ việc booking
    @Override
    public List<Customer> getList() {
        return (List<Customer>) new ReadAndWriteCustomerImp().readFile("src\\Case_study_new\\data\\customer.csv");
    }
}

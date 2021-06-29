package Case_study_new.controllers;

import Case_study_new.services.CustomerServiceImpl;
import Case_study_new.services.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);

    public void employeesMenu() {
        boolean case1 = true;
        while (case1) {
            System.out.println("1. Display all employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. Return menu");
            int choiceSecond = Integer.parseInt(scanner.nextLine());
            switch (choiceSecond) {
                case 1:
                    EmployeeServiceImpl.displayEmployee();
                    break;
                case 2:
                    EmployeeServiceImpl.addEmployee();
                    break;
                case 3:
                    System.out.println("Nhập id của employee muốn chỉnh sửa");
                    String idEmploy = scanner.nextLine();
                    EmployeeServiceImpl.editEmployee(idEmploy);
                    break;
                case 4:
                    case1 = false;
                    displayMainMenu();
                    break;
            }
        }
    }

    public void customerMenu(){
        boolean case2 = true;
        while (case2) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return menu");
            int choiceSecond = Integer.parseInt(scanner.nextLine());
            switch (choiceSecond) {
                case 1:
                    CustomerServiceImpl.displayCustomer();
                    break;
                case 2:
                    CustomerServiceImpl.addCustomer();
                    break;
                case 3:
                    System.out.println("Nhập id của customer muốn chỉnh sửa");
                    String idCustomer = scanner.nextLine();
                    CustomerServiceImpl.editCustomer(idCustomer);
                    break;
                case 4:
                    case2 = false;
                    displayMainMenu();
                    break;
            }
        }
    }

    public void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Managerment");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
            switch (choice) {
                case 1:
                   employeesMenu();
                   break;
                case 2:
                    customerMenu();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                   System.exit(0);
            }
        }
    }
}

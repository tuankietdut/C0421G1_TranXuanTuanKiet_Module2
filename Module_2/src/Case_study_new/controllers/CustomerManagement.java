package Case_study_new.controllers;

import Case_study_new.services.class_service.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerManagement {
    private static Scanner scanner = new Scanner(System.in);
    public void customerMenu() {
        while (true) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return menu");
            int choiceSecond = Integer.parseInt(scanner.nextLine());
            switch (choiceSecond) {
                case 1:
                    new CustomerServiceImpl().display();
                    break;
                case 2:
                    new CustomerServiceImpl().add();
                    break;
                case 3:
                    new CustomerServiceImpl().edit();
                    break;
                case 4:
                    return;
            }
        }
    }
}

package Case_study_new.controllers;

import Case_study_new.services.class_service.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityManagement {
    private static Scanner scanner = new Scanner(System.in);

    public void facilityMenu() {
        while (true) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display facility maintenance");
            System.out.println("4. Return menu");
            int choice = 0;
            boolean checkLoop = false;
            while (!checkLoop){
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    checkLoop = true;
                } catch (NumberFormatException ex) {
                    System.out.println("Nhập số cho chính xác");
                }
            }
            switch (choice) {
                case 1:
                   new FacilityServiceImpl().display();
                    break;
                case 2:
                    new FacilityServiceImpl().add();
                    break;
                case 3:
                    new FacilityServiceImpl().displayFacMaintain();
                    break;
                case 4:
                    return;
            }
        }
    }
}

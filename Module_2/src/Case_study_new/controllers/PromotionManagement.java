package Case_study_new.controllers;

import Case_study_new.services.class_service.FacilityServiceImpl;
import Case_study_new.services.class_service.PromotionServiceImpl;

import java.util.Scanner;

public class PromotionManagement {
    private static Scanner scanner = new Scanner(System.in);
    public void promotionMenu() {
        while (true) {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    new PromotionServiceImpl().display();
                    break;
                case 2:
                    new PromotionServiceImpl().listGetVoucher();
                    break;
                case 3:
                    return;
            }
        }
    }
}

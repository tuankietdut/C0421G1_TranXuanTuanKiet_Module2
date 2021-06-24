package _12_Java_collection.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager  {
    private List<Product> listProduct;
    private static Scanner scanner = new Scanner(System.in);

    public ProductManager() {
        listProduct = new ArrayList<>();
    }

    public void addProduct(Product element) {
        listProduct.add(element);
    }

    public void editProductWithId(int id) {
        for (byte i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                    System.out.println("What property do you want to edit??");
                    System.out.println("1. Name ");
                    System.out.println("2. Price");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            System.out.println("Enter name for product");
                            String newName = scanner.nextLine();
                            listProduct.get(i).setName(newName);
                            break;
                        case 2:
                            System.out.println("Enter price for product");
                            int newPrice = Integer.parseInt(scanner.nextLine());
                            listProduct.get(i).setPrice(newPrice);
                            break;
                    }
                }
            }
        }

    public void deleteProductWithId(int id) {
        for (byte i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                listProduct.remove(i);
                break;
            }
        }
    }

    public void displayProduct() {
        for (Product element : listProduct) {
            System.out.println(element.toString());
        }
    }

    public boolean isProductWithName(String name) {
        for (byte i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void sortWithPrice(){
        Collections.sort(listProduct);
    }
}

package _12_Java_collection.bai_tap;

public class TestProductManager {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product productOne = new Product(1,"Cam",45000);
        Product productTwo = new Product(2,"Xoài",30000);
        Product productThree = new Product(3,"Nho",150000);
        Product productFour = new Product(4,"Chanh dây",40000);
        Product productFive = new Product(5,"Chuối",22000);
        productManager.addProduct(productOne);
        productManager.addProduct(productTwo);
        productManager.addProduct(productThree);
        productManager.addProduct(productFour);
        productManager.addProduct(productFive);

        System.out.println("Display all fruit");
        productManager.displayProduct();

        System.out.println("After-sort---------");
        productManager.sortWithPrice();
        productManager.displayProduct();

        System.out.println("Find fruit with name");
        System.out.println(productManager.isProductWithName("Xoài"));

        System.out.println("Edit fruit with id");
        //Sửa tên sản phẩm thành quýt ở id 3
        productManager.editProductWithId(1);
        //Check xem quýt có hay ko?
        System.out.println(productManager.isProductWithName("Quýt"));
        System.out.println(productManager.isProductWithName("Cam"));
        System.out.println(productManager.isProductWithName("Quýt"));


    }
}

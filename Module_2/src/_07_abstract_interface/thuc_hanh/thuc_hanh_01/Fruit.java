package _07_abstract_interface.thuc_hanh.thuc_hanh_01;

public abstract class Fruit implements Edible {
    public static void main(String[] args) {
        Fruit[] fruit = new Fruit [2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit element: fruit){
            System.out.println(element.howToEat());
        }
    }
}

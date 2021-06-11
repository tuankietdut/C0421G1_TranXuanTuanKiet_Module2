package _07_abstract_interface.thuc_hanh.thuc_hanh_01;

public class TestAbstractInterface {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();

        for (Animal element: animals){
            System.out.println(element.makeSound());
            if (element instanceof Chicken) {
                System.out.println(((Chicken) element).howToEat());
            }
        }
    }
}

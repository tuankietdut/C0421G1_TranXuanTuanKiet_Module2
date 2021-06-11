package _07_abstract_interface.thuc_hanh.thuc_hanh_01;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }

}

package demo_app;

public class Test {
    public static void main(String[] args) {
        Person newObject = new Student(1,"Tân",23,"Đà Nẵng","10A4");
        newObject.travel();

        ((Student)newObject).study();
    }
}

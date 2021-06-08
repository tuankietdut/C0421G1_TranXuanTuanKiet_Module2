package _05_access_modifier_static.thuc_hanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        StaticProperty carOne = new StaticProperty("Mazda 3", "Skyactiv 3");
        StaticProperty carTwo = new StaticProperty("Mazda 4", "Skyactiv 4");
        System.out.println(StaticProperty.getNumberOfCars());
    }
}

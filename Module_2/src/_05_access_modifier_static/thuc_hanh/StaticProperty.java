package _05_access_modifier_static.thuc_hanh;

public class StaticProperty {
    private static int numberOfCars =0;
    private String name;
    private String engine;
    public static int getNumberOfCars() {
        return numberOfCars;
    }
    public static void setNumberOfCars(int numberOfCars) {
        StaticProperty.numberOfCars = numberOfCars;
    }
    public StaticProperty(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

}

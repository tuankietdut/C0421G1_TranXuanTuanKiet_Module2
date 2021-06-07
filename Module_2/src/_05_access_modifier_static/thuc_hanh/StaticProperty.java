package _05_access_modifier_static.thuc_hanh;

public class StaticProperty {
    public static int numberOfCars =0;
    private String name;
    private String engine;
    public StaticProperty(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}

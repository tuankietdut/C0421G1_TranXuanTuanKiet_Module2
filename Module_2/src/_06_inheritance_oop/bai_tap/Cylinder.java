package _06_inheritance_oop.bai_tap;

public class Cylinder extends Circle {
    public static void main(String[] args) {
        Cylinder testObject = new Cylinder();
        System.out.println(testObject.toString());

        Cylinder testObjectTwo = new Cylinder(2.3);
        System.out.println(testObjectTwo.getVolume());
        System.out.println(testObjectTwo.toString());

        Cylinder testObjectThree = new Cylinder(2.3, 2.0,"black");
        System.out.println(testObjectThree.getVolume());
        System.out.println(testObjectThree.toString());
    }
    private double height =1.0;
    public Cylinder(){
    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double height, double radius, String color){
        this.height = height;
        setRadius(radius);
        setColor(color);
    }
    public double getVolume(){
        return getArea()*height;
    }
    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + getRadius() +
                ", color=" + getColor() +
                '}';
    }
}

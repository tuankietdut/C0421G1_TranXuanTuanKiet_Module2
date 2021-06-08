package _06_inheritance_oop.thuc_hanh;

public class Circle extends Shape{
    private double radius = 1.0;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        super.setColor(color);
        super.setFilled(filled);
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getPerimeter() {
        return Math.PI*2*radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    @Override
    public String toString() {
        return "A Circle with radius "+ radius + ", which is a subclass of "+ super.toString();
    }
}
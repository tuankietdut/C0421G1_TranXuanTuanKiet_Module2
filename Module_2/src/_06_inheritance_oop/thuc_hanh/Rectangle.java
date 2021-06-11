package _06_inheritance_oop.thuc_hanh;

import _07_abstract_interface.bai_tap.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle() {
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        super.setColor(color);
        super.setFilled(filled);
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }
    @Override
    public double getArea() {
        return width * length;
    }
    @Override
    public String toString() {
        return "A Rectangle with width= "+width+", length= "+length+", which is a subclass of "+ super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setLength(getLength() + (percent/100));
        this.setWidth(getWidth() + (percent/100));
    }
}

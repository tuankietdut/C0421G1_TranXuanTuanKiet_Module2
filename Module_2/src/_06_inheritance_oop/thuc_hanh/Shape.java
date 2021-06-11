package _06_inheritance_oop.thuc_hanh;

public class Shape implements Comparable<Shape> {
    private String color = "green";
    private boolean filled = true;
    public Shape() {
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getArea(){
        return 0.0;
    }

    @Override
    public int compareTo(Shape o) {
        if (this.getArea() > o.getArea()){
            return 1;
        } else if (this.getArea() < o.getArea()){
            return -1;
        } else {
            return 1;
        }
    }
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (isFilled()?"filled":"not filled");
    }
}






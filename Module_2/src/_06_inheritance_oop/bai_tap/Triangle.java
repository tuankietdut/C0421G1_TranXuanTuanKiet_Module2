// Kế thừa các đặc điểm color và filled từ lớp Shape mục thực hành,
package _06_inheritance_oop.bai_tap;

import _06_inheritance_oop.thuc_hanh.Shape;

public class Triangle extends Shape {
    public static void main(String[] args) {
        Triangle test = new Triangle(1,1,5);
        System.out.println("Nếu kết quả hiển thị 0 thì đó ko phải là 1 hình tam giác");
        System.out.println(test.getPerimeter());
        System.out.println(test.getArea());
        System.out.println(test.toString());
    }
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(){
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public boolean isTriangle(){
        if ((side1+side2)>side3 && (side1+side3)>side2 && (side2+side3)>side1){
            return true;
        }else {
            return false;
        }
    }

    public double getArea(){
        if (isTriangle()){
            double p = 1.0/2*getPerimeter();
            return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        }else {
            return 0;
        }
    }

    public double getPerimeter(){
        if (isTriangle()){
            return (side1+side2+side3);
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", with color=" + getColor() +
                '}';
    }
}

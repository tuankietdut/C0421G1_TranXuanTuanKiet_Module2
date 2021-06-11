package _07_abstract_interface.thuc_hanh.thuc_hanh_03;

import _06_inheritance_oop.thuc_hanh.Circle;
import _06_inheritance_oop.thuc_hanh.Rectangle;
import _06_inheritance_oop.thuc_hanh.Shape;
import _06_inheritance_oop.thuc_hanh.Square;


import java.util.Arrays;

public class TestShape01 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(3.0,5.0);
        shapes[2] = new Square(6.0);
        shapes[3] = new Circle(8.0);

//        Shape.sortArr(shapes);
        Arrays.sort(shapes);

        System.out.println("Sắp xếp theo Area tăng dần");
        for (Shape element: shapes){
            System.out.println(element);
        }
    }
}

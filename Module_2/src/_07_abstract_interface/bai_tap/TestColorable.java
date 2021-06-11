package _07_abstract_interface.bai_tap;

import _06_inheritance_oop.thuc_hanh.Circle;
import _06_inheritance_oop.thuc_hanh.Rectangle;
import _06_inheritance_oop.thuc_hanh.Shape;
import _06_inheritance_oop.thuc_hanh.Square;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] arrShape = new Shape[3];
        arrShape[0] = new Circle(5.0);
        arrShape[1] = new Rectangle(4.5,5.0);
        arrShape[2] = new Square(5);

        for (byte i =0; i<arrShape.length; i++){
            if (arrShape[i] instanceof Colorable){
                ((Colorable)arrShape[i]).howToColor();
            }
        }
    }
}

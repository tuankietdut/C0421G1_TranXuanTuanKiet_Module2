
package _07_abstract_interface.bai_tap;
import _06_inheritance_oop.thuc_hanh.Circle;
import _06_inheritance_oop.thuc_hanh.Rectangle;
import _06_inheritance_oop.thuc_hanh.Shape;
import _06_inheritance_oop.thuc_hanh.Square;

public class TestShape extends Shape {
    public static void main(String[] args) {
        Shape[] arrShape = new Shape[3];
        arrShape[0] = new Circle(5.0);
        arrShape[1] = new Rectangle(4.5,5.0);
        arrShape[2] = new Square(5);

        System.out.println("Trước khi tăng size");
        for (byte i=0; i<arrShape.length; i++){
            if (arrShape[i] instanceof Circle){
                System.out.println(((Circle)arrShape[i]).getArea());
            } else if (arrShape[i] instanceof Rectangle){
                System.out.println(((Rectangle)arrShape[i]).getArea());
            } else {
                System.out.println(((Square)arrShape[i]).getArea());
            }
        }

        System.out.println("Sau khi tăng size ngẫu nhiên");
        for (byte i=0; i<arrShape.length; i++){
            if (arrShape[i] instanceof Circle){
                double number1 = Math.round(Math.random()*100);
                ((Circle)arrShape[i]).resize(number1);
                System.out.println("Với tỉ lệ tăng là: "+ number1 + "%");
                System.out.println(((Circle)arrShape[i]).getArea());
            } else if (arrShape[i] instanceof Rectangle){
                double number1 = Math.round(Math.random()*100);
                ((Rectangle)arrShape[i]).resize(number1);
                System.out.println("Với tỉ lệ tăng là: "+ number1 + "%");
                System.out.println(((Rectangle)arrShape[i]).getArea());
            } else {
                double number1 = Math.round(Math.random()*100);
                ((Square)arrShape[i]).resize(number1);
                System.out.println("Với tỉ lệ tăng là: "+ number1 + "%");
                System.out.println(((Square)arrShape[i]).getArea());
            }
        }

    }
}

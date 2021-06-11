package _07_abstract_interface.thuc_hanh.thuc_hanh_02;

import _06_inheritance_oop.thuc_hanh.Circle;
import _06_inheritance_oop.thuc_hanh.Shape;

public class ComparableCircle extends Circle implements Comparable<Shape>{
    public ComparableCircle() {
    }
    public ComparableCircle(double radius) {
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    public String getName(){
        return "Circle with radius: " + getRadius();
    }

    public static ComparableCircle[] sortArr(ComparableCircle[] object){
        for (byte i=0; i<object.length -1; i++){
            for (int j=i+1; j<object.length ; j++){
               if (object[j].getArea() > object[i].getArea()){
                   ComparableCircle objectSupport = object[i];
                   object[i] = object[j];
                   object[j] = objectSupport;
               }
            }
        }
        return object;
    }

}

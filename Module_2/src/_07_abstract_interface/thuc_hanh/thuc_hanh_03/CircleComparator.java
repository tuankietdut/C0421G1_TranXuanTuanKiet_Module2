package _07_abstract_interface.thuc_hanh.thuc_hanh_03;

import _06_inheritance_oop.thuc_hanh.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getArea() > o2.getArea()) {
            return 1;
        } else if (o1.getArea() < o2.getArea()){
            return -1;
        } else {
            return 1;
        }
    }
}

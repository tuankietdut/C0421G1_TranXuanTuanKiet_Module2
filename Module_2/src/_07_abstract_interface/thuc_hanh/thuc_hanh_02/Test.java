package _07_abstract_interface.thuc_hanh.thuc_hanh_02;

import _06_inheritance_oop.thuc_hanh.Circle;
import _06_inheritance_oop.thuc_hanh.Shape;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[6];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(8.9);
        circles[2] = new ComparableCircle(5.4,"indigo",false);
        circles[3] = new ComparableCircle(5.6);
        circles[4] = new ComparableCircle(7.2);
        circles[5] = new ComparableCircle(3.1);

        System.out.println("Mảng giảm dần");
        ComparableCircle.sortArr(circles);
        for (ComparableCircle element: circles){
            System.out.println(element);
        }

        System.out.println("Pre- sorted");
        for (ComparableCircle element: circles){
            System.out.println(element);
        }

        Arrays.sort(circles);
        System.out.println("After- sorted");
        for (ComparableCircle element: circles){
            System.out.println(element);
        }
    }
}


package _05_access_modifier_static.bai_tap;

import demo_app.Student;

public class TestStudents {
    public static void main(String[] args) {
        Students objOne = new Students();
        objOne.setName("Nam");
        objOne.setClasses("SO2");
        System.out.println(objOne.getName());
        System.out.println(objOne.getClasses());
    }
}

package _12_Java_collection.thuc_hanh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DifferentHashMapAndHashSet {
    public static void main(String[] args) {
        Student myStudentOne = new Student("Bình",23,"Đà Nẵng");
        Student myStudentTwo = new Student("Dần",20,"Quảng Nam");
        Student myStudentThree = new Student("Tí",21,"Nghệ An");
        Student myStudentFour = new Student("Mão",19,"Hà Tĩnh");

        Map<Integer, Student> myHashMap = new HashMap();
        myHashMap.put(1, myStudentOne);
        myHashMap.put(2, myStudentTwo);
        myHashMap.put(3, myStudentThree);
        myHashMap.put(4, myStudentFour);
        myHashMap.put(5, myStudentFour);
        System.out.println("Display hashMap");
       for (Map.Entry<Integer, Student> element: myHashMap.entrySet()){
           System.out.println(element.toString());
       }

       Set<Student> myHashSet = new HashSet();
       myHashSet.add(myStudentOne);
       myHashSet.add(myStudentTwo);
       myHashSet.add(myStudentThree);
       myHashSet.add(myStudentFour);
       myHashSet.add(myStudentFour);
        System.out.println("Display HashSet");
       for (Student element: myHashSet){
           System.out.println(element.toString());
       }


    }
    static class Student{
        private String name;
        private int age;
        private String address;

        public Student() {
        }

        public Student(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
}

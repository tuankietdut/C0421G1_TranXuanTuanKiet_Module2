package _10_DSA.bai_tap;

import _10_DSA.thuc_hanh.MyLinkedList;

public class testLinked {
    public static void main(String[] args) {
        class Student{
            public int id;
            public String name;
            public Student() {
            }
            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }
            public void setId(int id) {
                this.id = id;
            }
            public void setName(String name) {
                this.name = name;
            }
            public int getId() {
                return id;
            }
            public String getName() {
                return name;
            }
        }
        LinkedList<Student> myLinkedList = new LinkedList<>();
        Student student1 = new Student(1,"Trung1");
        Student student2 = new Student(2,"Trung 2");
        Student student3 = new Student(3,"Trung 3");
        Student student4 = new Student(4,"Trung 4");

        myLinkedList.addFirst(student1);
        myLinkedList.addLast(student2);
        myLinkedList.addLast(student3);
        myLinkedList.addLast(student4);
        myLinkedList.remove(1);

        LinkedList<Student> mylinkedList = myLinkedList.clone();

        for (int i=0; i<mylinkedList.size(); i++){
            Student student = (Student) mylinkedList.get(i);
            System.out.println(student.getName());
        }

        System.out.println(mylinkedList.getFirst().getId());


    }
}

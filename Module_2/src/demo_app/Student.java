package demo_app;

public class Student extends Person {
    private String classStudent;

    public Student(String classStudent) {
        this.classStudent = classStudent;
    }
    public Student(int id, String name, int age, String address, String classStudent) {
        super(id, name, age, address);
        this.classStudent = classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public String getClassStudent() {
        return classStudent;
    }

    @Override
    public void travel() {
        System.out.println("by bike");
    }
    public void study(){
        System.out.println("learn English");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", address='" + getAddress() + '\'' +
                ", class='" + classStudent + '\'' +
                '}';
    }
    }

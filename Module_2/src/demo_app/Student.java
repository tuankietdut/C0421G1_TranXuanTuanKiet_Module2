package demo_app;

public class Student {
    private  int id;
    private  String name;
    private  int age;
    private  String address;

    public Student() {
    }
    public Student(int idVariable, String nameVariable, int ageVariable, String adressVariable) {
        this.id = idVariable;
        this.name = nameVariable;
        this.age = ageVariable;
        this.address = adressVariable;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getAddress() {
        return address;
    }

    void setId(int idVariable) {
        id = idVariable;
    }

    void setName(String nameVariable) {
        name = nameVariable;
    }

    void setAge(int ageVariable) {
        age = ageVariable;
    }

    void setAddress(String addressVariable) {
        address = addressVariable;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + address + '\'' +
                '}';
    }
}

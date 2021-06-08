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

    public int getId() {
        return id;
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

    public void setId(int idVariable) {
        id = idVariable;
    }

    public void setName(String nameVariable) {
        name = nameVariable;
    }

    public void setAge(int ageVariable) {
        age = ageVariable;
    }

    public void setAddress(String addressVariable) {
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

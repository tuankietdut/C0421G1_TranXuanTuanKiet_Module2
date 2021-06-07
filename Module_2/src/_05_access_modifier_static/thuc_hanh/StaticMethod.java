package _05_access_modifier_static.thuc_hanh;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDTK";
    StaticMethod(int r, String n){
        this.rollno = r;
        this.name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno + " "+ name + " "+ college);
}
}

package _05_access_modifier_static.thuc_hanh;

public class StaticMethod {
    private int rollNo;
    private String name;
    private static String college = "BBDTK";
    public StaticMethod(int r, String n){
        this.rollNo = r;
        this.name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    @Override
    public String toString() {
        return "StaticMethod{" +
                "rollno=" + rollNo +
                ", name='" + name + '\'' +
                ", college='" + college +
                '}';
    }
}

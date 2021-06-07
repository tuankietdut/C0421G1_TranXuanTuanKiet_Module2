package _05_access_modifier_static.thuc_hanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod objOne = new StaticMethod(111,"Hoàng");
        StaticMethod objTwo = new StaticMethod(222,"Nam");
        objOne.display();
        objTwo.display();
    }
}

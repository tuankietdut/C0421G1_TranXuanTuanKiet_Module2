package _05_access_modifier_static.bai_tap;

public class TestAccessModifier {
    public static void main(String[] args) {
        AccessModifier testCase1 = new AccessModifier();
        AccessModifier testCase2 = new AccessModifier(4.0);
        System.out.println(testCase1.getRadius());
        System.out.println(testCase1.getArea());
        System.out.println(testCase2.getRadius());
        System.out.println(testCase2.getArea());
    }
}

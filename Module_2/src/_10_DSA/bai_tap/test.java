package _10_DSA.bai_tap;


public class test {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("Huy");
        student.add("Tuấn");
        student.add("Quang");
//      for (byte i=0; i<student.size(); i++){
//          System.out.println(student.element[i]);
//      }

      student.remove(0);
        for (byte i=0; i<student.size(); i++){
            System.out.println(student.element[i]);
        }
    }

}

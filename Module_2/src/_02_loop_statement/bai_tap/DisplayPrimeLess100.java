package _02_loop_statement.bai_tap;

public class DisplayPrimeLess100 {
    public static void main(String[] args) {
        System.out.println("Danh sách các số nguyên tố nhỏ hơn 100");
        String result = " ";
        for (byte i=2; i<100; i++){
            int count =0;
            for (byte j=1; j<=Math.sqrt(i); j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count ==1){
                result += i + " ";
            }
        }
        System.out.println(result);
    }
}

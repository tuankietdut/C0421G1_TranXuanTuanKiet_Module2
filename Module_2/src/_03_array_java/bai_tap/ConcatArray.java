package _03_array_java.bai_tap;

public class ConcatArray {
    public static void main(String[] args) {
        int[] arrayOne = {1,2,3,4,5,6,7,8,9,10,12};
        int[] arrayTwo = {9,10,11,12,13,14,15};
        int[] arrayThree = new int[arrayOne.length + arrayTwo.length];
        byte j=0;
        for (byte i=0; i<arrayThree.length; i++){
            if (i<arrayOne.length){
                arrayThree[i] = arrayOne[i];
            } else {
                arrayThree[i] = arrayTwo[j];
                j++;
            }
        }
        for (int element: arrayThree){
            System.out.println(element);
        }
    }
}

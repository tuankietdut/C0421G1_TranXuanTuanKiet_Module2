package _03_array_java.thuc_hanh;

public class FindMinValueInArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 20, 5, 6, 8};
        System.out.println("Giá trị nhỏ nhất trong mảng: "+ FindMin(arr) );
    }


    public static int FindMin(int[] array) {
        int min = array[0];
        for (byte i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

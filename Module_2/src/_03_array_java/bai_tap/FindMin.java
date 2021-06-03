package _03_array_java.bai_tap;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {9,6,8,4,1,2,5,-8};
        int min = arr[0];
        for (byte i=0; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong chuỗi: "+ min);
    }
}

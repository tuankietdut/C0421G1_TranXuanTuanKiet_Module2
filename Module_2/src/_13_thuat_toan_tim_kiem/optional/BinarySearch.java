package _13_thuat_toan_tim_kiem.optional;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myArr = {1,2,3,4,5,6,7,8,9,10,12,15};

        System.out.println("index is: " + searchElement(myArr, 5,0,myArr.length));
    }
    public static int searchElement(int[] arr, int value, int low, int heigh) {
        while (low <= heigh) {
            int mid = (low + heigh) / 2;
            if (value == arr[mid]) {
                return mid;
            } else if (value > arr[mid]) {
                return searchElement(arr, value, mid + 1, heigh);
            } else if (value < arr[mid]) {
                return searchElement(arr, value, low, mid - 1);
            }
        }
        return -1;
    }
}

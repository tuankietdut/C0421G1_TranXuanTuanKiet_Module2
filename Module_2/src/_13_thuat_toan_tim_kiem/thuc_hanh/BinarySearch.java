package _13_thuat_toan_tim_kiem.thuc_hanh;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(6, arr));
    }
    static int[] arr = {1,2,3,4,5,6,7,8,9,10,15,20};
    public static int binarySearch(int value, int[] arrVar){
        int left =0;
        int right = arrVar.length-1;
        while (left<= right){
            int mid = (right - left)/2;
            if (value == arrVar[mid]){
                return mid;
            }else if (value < mid){
                right = mid-1;
            }else {
                left = mid +1;
            }
        }
        return -1;
    }
}

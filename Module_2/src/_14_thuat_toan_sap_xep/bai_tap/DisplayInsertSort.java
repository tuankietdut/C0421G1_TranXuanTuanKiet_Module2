// 2 bài đều về InsertSort nên em gộp chung
package _14_thuat_toan_sap_xep.bai_tap;


public class DisplayInsertSort {
    public static void main(String[] args) {
        /*

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input capacity of Array");
        int size = scanner.nextInt();
        int[] inputArr = new int[size];
        for (byte i = 0; i < size; i++) {
            inputArr[i] = scanner.nextInt();
        }
        insertSort(inputArr);

         */

        insertSort(list);
        for (int element : list) {
            System.out.println(element);
        }
    }

    public static int[] list = {5, 4, 7, 8, 9, 2, 1, 4, 5};//4,5,7,8,9,2

    public static void insertSort(int[] list) {
        for (byte i = 1; i < list.length; i++) {
            int currentVar = list[i];
            int k;
            for (k = i; k > 0 && currentVar < list[k - 1]; k--) {
                list[k] = list[k - 1];
                System.out.println("Element: " + list[k - 1] + " đẩy ra sau 1 index ");
            }
            System.out.println("Chèn phần từ: " + currentVar + " vào phần tử: " + list[k]);
            list[k] = currentVar;
        }
    }
}






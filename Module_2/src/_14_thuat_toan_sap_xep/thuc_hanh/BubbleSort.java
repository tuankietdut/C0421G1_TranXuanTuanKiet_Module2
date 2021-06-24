package _14_thuat_toan_sap_xep.thuc_hanh;

public class BubbleSort {
    public static int[] array = {1, 5, 7, 45, 7, 8, 3, 4, 5};

    public static void bubbleSort(int[] list) {
        boolean checkSort = true;
        for (byte i = 0; i < list.length && checkSort; i++){
            checkSort = false;
            for (byte j = 0;j <list.length-i -1; j++ )
            if (list[j] > list[j+1]){
                int tepm = list [j];
                list[j] = list[j+1];
                list[j+1] = tepm;
                checkSort = true;
            }
        }

    }

    public static void main(String[] args) {
        bubbleSort(array);
        for (int element: array){
            System.out.println(element);
        }

    }


}


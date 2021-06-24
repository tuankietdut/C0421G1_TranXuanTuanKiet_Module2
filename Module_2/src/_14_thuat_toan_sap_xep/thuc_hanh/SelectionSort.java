package _14_thuat_toan_sap_xep.thuc_hanh;

public class SelectionSort {
    public static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] list){
        for (byte i=0; i<list.length ; i++){
            double currentMax = list[i];
            int indexCurrentMax = i;
            for (int j = i+1; j <list.length -1; j++){
                if (list[j] > currentMax){
                    currentMax = list[j];
                    indexCurrentMax = j;
                }
            }
            if (indexCurrentMax != i){
                list[indexCurrentMax] = list[i];
                list[i] = currentMax;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (double element: list){
            System.out.println(element);
        }
    }
}

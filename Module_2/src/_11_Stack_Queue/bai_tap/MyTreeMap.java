package _11_Stack_Queue.bai_tap;


import java.util.Arrays;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        java.util.TreeMap< String,Integer> myTreeMap = new java.util.TreeMap<>();
        String var = "I am a doctor, and a teacher";
        String[] variable = var.toLowerCase().split("");
        int count =0;
        System.out.println(Arrays.toString(variable));
        for (int i=0; i<variable.length; i++){
            if (variable[i].equals(",") || variable[i].equals(" ")){
                continue;
            }
           if (myTreeMap.containsKey(variable[i])){
               count = myTreeMap.get(variable[i]) +1;
               myTreeMap.put(variable[i], count);
           }else {
               myTreeMap.put(variable[i], 1);
           }
        }
        System.out.println(myTreeMap);

    }
}

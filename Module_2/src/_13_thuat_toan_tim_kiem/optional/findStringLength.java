package _13_thuat_toan_tim_kiem.optional;

import java.util.LinkedList;
import java.util.List;

public class findStringLength {
    public static void main(String[] args) {
        String a = "abcabcdgabxy";
        searchMaxStringSub(a);
        String b = "abcabcdgabmnsxy";
        searchMaxStringSub(b);

    }
    public static void searchMaxStringSub(String var){
        List<Character> myList = new LinkedList<>();
        List<Character> myResult = new LinkedList<>();
        for (int i=0; i< var.length(); i++){
            if (myList.size()>1  && myList.contains(var.charAt(i))){
                myList.clear();
            }
            myList.add(var.charAt(i));
            if (myList.size() > myResult.size()){
                myResult.clear();
                myResult.addAll(myList);
            }
        }
        System.out.println(myResult);
    }
}

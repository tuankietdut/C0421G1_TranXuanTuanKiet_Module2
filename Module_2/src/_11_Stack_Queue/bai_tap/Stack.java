package _11_Stack_Queue.bai_tap;

import java.util.ArrayList;
import java.util.LinkedList;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> myStack = new java.util.Stack<>();
        int[] myArr = {1, 2, 3, 4, 5};
        for (byte i = 0; i < myArr.length; i++) {
            myStack.push(myArr[i]);
        }
        for (byte i = 0; i < myArr.length; i++) {
            myArr[i] = myStack.pop();
        }
        for (int element : myArr) {
            System.out.println(element);
        }

        java.util.Stack<String> myStack2 = new java.util.Stack<>();
        String word = "myGedoC";
        String output = "";
        String[] mWord = word.split("");
        for (byte i = 0; i < mWord.length; i++) {
            myStack2.push(mWord[i]);
        }
        for (byte i = 0; i < mWord.length; i++) {
            output += myStack2.pop();
        }
        System.out.println(output);
    }
}

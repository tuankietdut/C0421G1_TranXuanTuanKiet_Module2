package _11_Stack_Queue.optional;

import java.util.PriorityQueue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack();
        PriorityQueue<String> myQueue = new PriorityQueue<>();
        String var = "Able of a was I ere I saw a Elba";
        boolean isPalindrome = true;
        String[] variable = var.toLowerCase().split("");
        for (int i=0; i<variable.length; i++){
            myStack.push(variable[i]);
        }

        for (int i=0; i<variable.length; i++){
            if (!myStack.pop().equals(variable[i])){
                isPalindrome = false;
                break;
            }
            }
        if (isPalindrome){
            System.out.println("aaaaaa");
        }else {
            System.out.println("bbbbb");
        }
        }
    }

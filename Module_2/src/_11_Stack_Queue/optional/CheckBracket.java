package _11_Stack_Queue.optional;

import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        java.util.Stack<String> myStack = new Stack<>();
        String testCase1 = "(s * (s – a) * (s – b)) * (s – c)";
        String[] testCase1ToArray = testCase1.split("");
        boolean checkResult = true;
        for( int i=0; i< testCase1ToArray.length; i++){
            if (testCase1ToArray[i].equals("(")){
                myStack.push(testCase1ToArray[i]);
            }
            if (testCase1ToArray[i].equals(")")){
                if (myStack.isEmpty()){
                    checkResult = false;
                    break;
                }
                myStack.pop();
                if (!myStack.isEmpty()){
                    for (int j = i+1; j<testCase1ToArray.length; j++){
                        if (testCase1ToArray[j].equals("(")){
                            checkResult = false;
                            break;
                        } else if (testCase1ToArray[j].equals(")")){
                            j = testCase1ToArray.length;
                        }
                    }
                }
            }
        }
        if (myStack.isEmpty() && checkResult){
            System.out.println("Well");
        }else {
            System.out.println("?????");
        }
            }

}






package _11_Stack_Queue.optional;

public class Stack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();



    }
    private int[] arr;
    private int size;
    private int index;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isFull(){
        if (index == size){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if (index == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return index;
    }

    public int pop(){
        if (isEmpty()){
            return -1;
        }
        int tepm = arr[--index];
        arr[index] = 0;
        System.out.println("element: " + tepm + " pop");
        return tepm;
    }

    public void push(int element){
        if (isFull()){
            System.out.println("Full, cannot push");
        }else {
            arr[index++] = element;
            System.out.println("element: " + element + " pushed");
        }
    }
}

package _11_Stack_Queue.optional;

import java.util.Arrays;

public class MyQueue {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        for (int element: myQueue.queueArr){
            System.out.println(element);
        }
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.enqueue(8);
        for (int element: myQueue.queueArr){
            System.out.println(element);
        }
    }

    private int capacity;
    private int[] queueArr;
    private int head;
    private int tail;
    private int currentSize;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[capacity];
    }

    public boolean isQueueFull(){
        if (currentSize == capacity){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if (currentSize ==0){
            return true;
        }
        return false;
    }

    public void enqueue(int element){
        if (isQueueFull()){
            System.out.println("Overflow!! full mảng, không thể thêm được nữa");
        } else {
            if (this.tail == capacity){
                this.tail =0;
            }
            this.queueArr[this.tail] = element;
            this.tail++;
            currentSize++;
            System.out.println("Element: " + element + " is pushed to Queue" );
        }
    }

    public void dequeue(){
        if (isEmpty()){
            System.out.println("No element to delete");
        }else {
            if (this.head == capacity){
                this.head =0;
            }
            int tepm = this.queueArr[head];
            this.queueArr[this.head++] = 0;
            System.out.println("Pop operation done!!: " +tepm);
           currentSize--;
        }
    }

}

package _11_Stack_Queue.thuc_hanh;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue<String> myQueue = new MyLinkedListQueue();
        myQueue.enqueue( "Tuấn");
        myQueue.enqueue("Phạm");
        myQueue.enqueue("Hòa");
        System.out.println("Item dequeue " + myQueue.dequeue().value);
        System.out.println("Item dequeue " + myQueue.dequeue().value);

    }
}

package _11_Stack_Queue.bai_tap;

public class Queue<E> {
    public static void main(String[] args) {
        Queue<Integer> myquene = new Queue<>();
        myquene.enQueue(1);
        myquene.enQueue(2);
        myquene.enQueue(3);
        myquene.enQueue(4);
        System.out.println("Trước khi deQueue");
        myquene.display();
        myquene.deQueue();
        myquene.deQueue();
        myquene.deQueue();
        System.out.println("SAu khi deQueue");
        myquene.display();

    }
    class Node{
        public Object data;
        public Node next;
        public Node(Object data) {
            this.data = data;
        }
    }
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue (E element){
        Node tepm = new Node(element);
        if (this.front == null){
            this.front = this.rear = tepm;
        } else {
            this.rear.next = tepm;
            this.rear = tepm;
            this.rear.next = this.front;
        }
    }
    public void deQueue(){
        if (this.front == null){
            return ;
        }
        if (this.front == this.rear){
            this.front = this.rear = null;
        } else {
            this.front = this.front.next;
            this.rear.next = this.front;
        }
    }

    public void display() {
        Node tepm = this.front;
        do {
            System.out.println(tepm.data);
            tepm = tepm.next;
        } while (!(tepm == front));
    }
}

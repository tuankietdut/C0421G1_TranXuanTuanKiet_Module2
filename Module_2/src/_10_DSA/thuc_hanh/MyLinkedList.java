package _10_DSA.thuc_hanh;

import jdk.dynalink.NamedOperation;
import org.w3c.dom.Node;

public class MyLinkedList {
    private int numNodes =0;
    private Node head;

    public MyLinkedList(Object data) {
        this.head = new Node (data);
    }
    private class Node{
        private Node next;
        private Object data;
        public Node(Object data) {
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }

    public void add(int index, Object data){
        Node tepm = head;
        Node holder;
        for (int i=0; i< index-1 && tepm.next != null; i++){
            tepm = tepm.next;
        }
        holder = tepm.next;
        tepm.next = new Node(data);
        tepm.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data){
        Node tepm = head;
        head = new Node(data);
        head.next = tepm;
        numNodes++;
    }

    public Node get(int index){
        Node tepm = head;
        for (int i=0; i<index; i++){
            tepm = tepm.next;
        }
        return tepm;
    }

    public void printList(){
        Node tepm = head;
        while (tepm!= null){
            System.out.println(tepm.data);
            tepm = tepm.next;
        }
    }
}

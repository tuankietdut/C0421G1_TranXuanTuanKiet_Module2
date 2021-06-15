package _10_DSA.thuc_hanh;

public class LinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst("tuổi");
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(2,9);
        ll.add(4,9);
        ll.printList();
    }
}

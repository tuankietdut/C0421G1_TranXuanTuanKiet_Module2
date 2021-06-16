package _10_DSA.bai_tap;

public class LinkedList<E> {
    private class Nodes {
        public Nodes next;
        public Object data;

        public Nodes(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    private Nodes head;
    private int numNodes = 0;

    public LinkedList() {
    }

    public void addFirst(E element) {
        Nodes tepm = head;
        head = new Nodes(element);
        head.next = tepm;
        numNodes++;
    }

    public void addLast(E element) {
        Nodes tepm = head;
        while (tepm.next != null) {
            tepm = tepm.next;
        }
        tepm.next = new Nodes(element);
        numNodes++;
    }

    public void add(int index, E element) {
        Nodes tepm = head;
        Nodes holder;
        for (int i = 0; i < index - 1 && tepm.next != null; i++) {
            tepm = tepm.next;
        }
        holder = tepm.next;
        tepm.next = new Nodes(element);
        tepm.next.next = holder;
        numNodes++;
    }

    public E get(int index) {
        Nodes tepm = head;
        for (int i = 0; i < index; i++) {
            tepm = tepm.next;
        }
        return  (E) tepm.data;
    }

    public int size() {
        return numNodes;
    }

    public E remove(int index) {
        if (index >= 0 && index <= numNodes) {
            Nodes tepm = head;
            Object data;
            if (index == 0) {
                data = tepm.data;
                head = head.next;
            } else {
                for (int i = 0; i < index - 1 && tepm.next != null; i++) {
                    tepm = tepm.next;
                }
                data = tepm.next.data;
                tepm.next = tepm.next.next;
            }
            numNodes--;
            return (E) data;
        } else {
            throw new IllegalArgumentException("Exception index" + index);
        }
    }

    public boolean remove(E element) {
        Nodes tepm = head;
        if (tepm.data.equals(element)) {
            remove(0);
            return true;
        } else {
            for (int i = 0; i < numNodes; i++) {
                if (tepm.data.equals(element)) {
                    tepm.next = tepm.next.next;
                    numNodes--;
                    return true;
                }
                tepm = tepm.next;
            }
        }
        return false;
    }

    public LinkedList<E> clone() {
        if (numNodes == 0) {
            throw new IllegalArgumentException("numNodes" + numNodes);
        }
        LinkedList<E> result = new LinkedList<>();
        Nodes tepm = head;
        result.addFirst((E) tepm.data);
        while (tepm.next != null) {
            tepm = tepm.next;
            result.addLast((E) tepm.data);
        }
        return result;
    }

    public boolean contains(E element) {
        Nodes tepm = head;
        for (int i = 0; i < numNodes; i++) {
            if (tepm.data.equals(element)) {
                return true;
            }
            tepm = tepm.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Nodes tepm = head;
        for (int i = 0; i < numNodes; i++) {
            if (tepm.data.equals(element)) {
                return i;
            }
            tepm = tepm.next;
        }
        return -1;
    }

    public E getFirst() {
        return (E) head.data;
    }

    public E getLast() {
        Nodes tepm = head;
        while (tepm.next != null) {
            tepm = tepm.next;
        }
        return (E) tepm.data;
    }

}



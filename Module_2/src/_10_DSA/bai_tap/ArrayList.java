package _10_DSA.bai_tap;

public class ArrayList<E> {
    private int size =0;
    private static final int DEFAULT_CAPACITY =10;
    private Object[] element;

    public ArrayList() {
    }

    public ArrayList(int capacity) {
        element = new Object[capacity];
    }

    

    public void add(int index, E element){
        for (int i=this.element.length; i>index; i++){
            this.element[i+1] = this.element[i];
        }
        this.element[index] = element;
    }
}

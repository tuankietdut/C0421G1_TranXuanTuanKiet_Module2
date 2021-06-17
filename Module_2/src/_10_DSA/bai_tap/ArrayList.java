package _10_DSA.bai_tap;

import java.util.Arrays;

public class ArrayList<E> {

    private int size =0;
    private static final int DEFAULT_CAPACITY =10;
    public Object[] element;

    public ArrayList(){
        element = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity) {
        if (capacity>=0){
            element = new Object[capacity];
        }else {
            throw new IllegalArgumentException("Capacity" + capacity);
        }
    }

    public int size(){
        return size;
    }

    public void clear(){
        for (byte i=0; i<element.length; i++){
            element[i] = null;
        }
        this.size =0;
    }

    public boolean add(E e){
        if (this.element.length == size){
            ensureCapacity(10);
        }
        element[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity){
        if (minCapacity>=0){
            int newSize = this.element.length + minCapacity;
            element = Arrays.copyOf( element , newSize);
        }else {
            throw new IllegalArgumentException("minCapacity" + minCapacity);
        }
    }

    public void add(int index, E element){
        if (index>this.element.length){
            throw new IllegalArgumentException("index"+ index);
        }else if (this.element.length == size){
            ensureCapacity(10);
        }
        if (this.element[index] == null){
            this.element[index] = element;
            size++;
        }else {
            for (int i=this.size-1; i>=index; i--){
                this.element[i] = this.element[i+1];
            }
            this.element[index] = element;
            size++;
        }
    }

    public E get(int index){
        return (E) element[index];
    }

    public int indexOf(E element){
        for (byte i=0; i< this.element.length; i++){
            if (this.element[i] == element){
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E element){
        return indexOf(element) >=0;
    }

    public ArrayList<E> clone(){
        ArrayList<E> tepm = new ArrayList<>();
        tepm.element = Arrays.copyOf(this.element, this.size);
        tepm.size = this.size;
        return tepm;
    }

    public E remove(int index){
        if (index >= 0 && index <= size){
            for (int i = index; i<size -1; i++){
                this.element[i] = this.element[i+1];
            }
            element[size-1] = null;
            size--;
            return (E) this.element;
        }else {
            throw new IllegalArgumentException("index" + index);
        }
    }
}

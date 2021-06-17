package _11_Stack_Queue.thuc_hanh;

public class GenericStackClient {
    public static void main(String[] args) {
        stackOfIInteger();;
        stackOfIStrings();
    }
    private static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        stack.push("Five");
        System.out.println("size: " + stack.size());
        System.out.println("Pop element: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    private static void stackOfIInteger(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("size: " + stack.size());
        System.out.println("Pop element: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

}

package _12_Java_collection.optional;

public class TreeNode<E> {
    public static void main(String[] args) {
        TreeNode<Integer> myTree = new TreeNode<>();
        myTree.insert(50);
        myTree.insert(20);
        myTree.insert(30);
        myTree.insert(40);
        myTree.insert(70);
        myTree.insert(60);
        myTree.insert(80);

        myTree.postOder();


    }
    private class Node{
        public int value;
        private Node left;
        private Node right;

        public Node(int num) {
            this.value = num;
            this.left = null;
            this.right = null;
        }
    }
    private Node root;

    public TreeNode() {
        this.root = null;
    }

    private Node insertRec(Node root, int value){
        if (root == null){
            root = new Node(value);
        }
        if (value< root.value){
            root.left = insertRec(root.left, value);
        }else if (value > root.value){
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void insert(int value){
        root = insertRec(root, value);
    }

    private void postOderRec(Node root){
        if (root != null){
            postOderRec(root.left);
            postOderRec(root.right);
            System.out.println(root.value + " ");
        }
    }

    public void postOder(){
        postOderRec(root);
    }
}

package practabstract.basics;

public class Tress {
    public static void main(String[] args) {

        BinaryTree trees = new BinaryTree(5);

        trees.root.left=new Node(1);
        trees.root.right=new Node(6);

    }
}

class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }

}

class BinaryTree{
    Node root;

    public BinaryTree(int key){
        root=new Node(key);
    }

    public BinaryTree(){
        root=null;
    }

    public void insert(int val){
        while(root.left!=null || root.right!=null){
            
        }
    }
}
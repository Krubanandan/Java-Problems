import java.util.*;

public class BST {

  public static void main(String[] args) {
    BinaryTree bst = new BinaryTree();
    Scanner scan = new Scanner(System.in);
    bst.populate(scan);
    // bst.display();
    // bst.prettyDisplay();

    bst.inorder();
    System.out.println();
    bst.preorder();
    System.out.println();
    bst.postorder();
  }
}

class BinaryTree {

  private static class Node {

    int value;
    Node left;
    Node right;

    public Node(int value) {
      this.value = value;
      left = right = null;
    }
  }

  private Node root;

  public void populate(Scanner scan) {
    System.out.println("Enter root node");
    int val = scan.nextInt();
    root = new Node(val);
    populate(scan, root);
  }

  private void populate(Scanner scan, Node node) {
    System.out.println(
      "Do you want enter left of" + node.value + " enter truefalse"
    );
    boolean left = scan.nextBoolean();

    if (left) {
      System.out.println("Enter element to add left of " + node.value);
      int val = scan.nextInt();
      node.left = new Node(val);
      populate(scan, node.left);
    }

    System.out.println(
      "Do you want enter right of" + node.value + " enter truefalse"
    );
    boolean right = scan.nextBoolean();

    if (right) {
      System.out.println("Enter element to add right of " + node.value);
      int val = scan.nextInt();
      node.right = new Node(val);
      populate(scan, node.right);
    }
  }

  public void display() {
    display(this.root, "");
  }

  private void display(Node node, String indent) {
    if (node == null) {
      return;
    }
    System.out.println(indent + node.value);
    display(node.left, indent + "\t");
    display(node.right, indent + "\t");
  }

  public void prettyDisplay() {
    prettyDisplay(root, 0);
  }

  private void prettyDisplay(Node node, int level) {
    if (node == null) {
      return;
    }

    prettyDisplay(node.right, level + 1);

    if (level != 0) {
      for (int i = 0; i < level - 1; i++) {
        System.out.print("|\t\t");
      }
      System.out.println("|------->" + node.value);
    } else {
      System.out.println(node.value);
    }
    prettyDisplay(node.left, level + 1);
  }

  public void inorder() {
    inorder(root);
  }

  private void inorder(Node node) {
    if (node != null) {
      inorder(node.left);
      System.out.print(node.value + " ");
      inorder(node.right);
    }
  }

  public void preorder() {
    preorder(root);
  }

  private void preorder(Node node) {
    if (node != null) {
      System.out.print(node.value + " ");
      preorder(node.left);
      preorder(node.right);
    }
  }

  public void postorder() {
    postorder(root);
  }

  private void postorder(Node node) {
    if (node != null) {
      postorder(node.left);

      postorder(node.right);
      System.out.print(node.value + " ");
    }
  }
}

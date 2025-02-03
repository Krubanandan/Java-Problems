import java.util.LinkedList;
import java.util.Scanner;
public class trees{
    public static void main(String[] args){
        treeNode trie=new treeNode(5);
        trie.left=new treeNode(6);
        trie.right=new treeNode(7);
        System.out.println(trie.left.data);
        LinkedList<Integer> ints=new LinkedList<>();
        ints.add(5);
        

    }

    static void insert(treeNode tree,int data){
        Scanner scan=new Scanner(System.in);
        System.out.println("Where do you want to insert 1.Left 2.Right 3. Exit");
        int choice=scan.nextInt();
        // while(){
        //     if
        // }
        

    }
}

class treeNode{
    int data;
    treeNode left;
    treeNode right;

    treeNode(int data){
        this.data=data;
        left=right=null;
    }
}
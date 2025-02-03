

class linkedlist {
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        System.out.println("Previous");
        display(head);
        System.out.println();
        head=rev(head);
        System.out.println("After");
        display(head);
        
    }
    
    static void display(Node head){
        Node temp=head;
        
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        
    }
    
    static Node rev(Node head){
        Node prev=null;
        Node curr=head;
        
        while(curr!=null){
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
    
}

class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
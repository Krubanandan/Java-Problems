// package LinkedLists;


class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class CycleLinkedList {
    // Method to detect cycle in a linked list
    public boolean hasCycle(ListNode head) {
        // Initialize two pointers
        ListNode fast = head;
        ListNode slow = head;

        // Loop to move fast and slow pointers
        while (fast != null && fast.next != null) {
            fast = fast.next.next; // Fast pointer moves two steps
            slow = slow.next;      // Slow pointer moves one step

        
            if (fast == slow) {
                return true;
            }
        }
        
        // If we exit the loop, no cycle exists
        return false;
    }

    // Utility method to create a cycle in the list (for testing)
    public void createCycle(ListNode head, int pos) {
        if (pos < 0) return;

        ListNode cycleNode = head;
        for (int i = 0; i < pos; i++) {
            if (cycleNode != null) {
                cycleNode = cycleNode.next;
            }
        }

        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = cycleNode; // Creating the cycle
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a linked list: 3 -> 2 -> 0 -> -4, with a cycle at position 1
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        
        CycleLinkedList solution = new CycleLinkedList();

        // Create a cycle at position 1 (0-based index)
        solution.createCycle(node1, 1);

        // Test for cycle
        boolean result = solution.hasCycle(node1);
        if (result) {
            System.out.println("Cycle detected in the linked list.");
        } else {
            System.out.println("No cycle detected in the linked list.");
        }
    }
}


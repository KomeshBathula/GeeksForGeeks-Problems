/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public boolean detectLoop(Node head) {
        // code here
        // using set
        /*
        HashSet<Node> set = new HashSet<>();
        Node temp = head;
        while (temp != null) {
            set.add(temp);
            temp = temp.next;
            if (set.contains(temp)) return true;
        }
        return false;
        */
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
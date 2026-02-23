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
    public Node insertAtFront(Node head, int x) {
        // code here
        Node p = new Node(x);
        p.data = x;
        p.next = head;
        head = p;
        return head;
    }
}
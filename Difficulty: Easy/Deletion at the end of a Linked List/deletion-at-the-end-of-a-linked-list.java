/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
        // code here
        if (head == null || head.next == null) return null;
        Node p = head;
        while (p.next.next != null) {
            p = p.next;
        }
        p.next = null;
        return head;
    }
}
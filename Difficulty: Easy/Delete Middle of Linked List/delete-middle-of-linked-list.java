/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if (head == null || head.next == null) return null;
        Node prev = null, sp = head, fp = head;
        while (fp != null && fp.next != null) {
            fp = fp.next.next;
            prev = sp;
            sp = sp.next;
        }
        prev.next = sp.next;
        return head;
    }
}
/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if (head == null || head.next == null) return head;
        int length = 1;
        Node temp = head;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }
        k = k % length;
        if (k == 0) return head;
        temp.next = head; // made a loop
        Node curr = head;
        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }
        Node newHead = curr.next;
        curr.next = null;
        temp.next = head;
        return newHead;
    }
}
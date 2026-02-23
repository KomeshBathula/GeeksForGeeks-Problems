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
    Node reverseList(Node head) {
        // code here
        Node prev = null, curr = head, upcoming = head;
        while (upcoming != null) {
            upcoming = curr.next;
            curr.next = prev;
            prev = curr;
            curr = upcoming;
        }
        return prev;
    }
}
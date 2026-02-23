// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public static boolean searchLinkedList(Node head, int x) {
        // Your code here
        Node p = head;
        while (p != null) {
            if (p.data == x) return true;
            p = p.next;
        }
        return false;
    }
}
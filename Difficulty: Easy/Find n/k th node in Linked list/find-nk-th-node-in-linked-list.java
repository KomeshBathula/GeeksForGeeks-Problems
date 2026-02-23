/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public static int fractional_node(Node head, int k) {
        // Your code here
        int length = 0;
        Node temp = head;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }
        int point = (int)Math.ceil(length / k);
        temp = head;
        for (int i = 0; i < point; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
}
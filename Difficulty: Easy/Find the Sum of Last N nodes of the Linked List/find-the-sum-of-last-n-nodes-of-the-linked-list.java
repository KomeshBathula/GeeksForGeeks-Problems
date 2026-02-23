/*
Node class is as follows:

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        if (head == null) return 0;
        // first find the length
        if (n == 0) return 0;
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int skip = length - n;
        temp = head;
        for (int i = 0; i < skip; i++)
            temp = temp.next;
        int sum = 0;
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        return sum;
    }
}
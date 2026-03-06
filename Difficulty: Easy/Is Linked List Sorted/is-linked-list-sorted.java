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
    public boolean isSorted(Node head) {
        // code here
        Node temp = head;
        int prev = temp.data;
        boolean nonIncrease = false, nonDecrease = false;
        temp = temp.next;
        while (temp != null) {
            if (temp.data < prev) nonIncrease = true;
            if (temp.data > prev) nonDecrease = true;
            prev = temp.data;
            if (nonIncrease && nonDecrease) return false;
            temp = temp.next;
        }
        return true;
    }
}
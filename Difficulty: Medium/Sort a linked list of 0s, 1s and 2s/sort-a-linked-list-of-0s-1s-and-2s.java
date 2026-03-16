/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node zeroNode = new Node(-1);
        Node oneNode = new Node(-1);
        Node twoNode = new Node(-1);
        Node zeroNodeHead = zeroNode, oneNodeHead = oneNode, twoNodeHead = twoNode;
        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                zeroNode.next = temp;
                zeroNode = zeroNode.next;
            } else if (temp.data == 1) {
                oneNode.next = temp;
                oneNode = oneNode.next;
            } else {
                twoNode.next = temp;
                twoNode = twoNode.next;
            }
            temp = temp.next;
        }
        zeroNode.next = (oneNodeHead.next != null) ? oneNodeHead.next : twoNodeHead.next;
        oneNode.next = twoNodeHead.next;
        twoNode.next = null;
        return zeroNodeHead.next;
    }
}
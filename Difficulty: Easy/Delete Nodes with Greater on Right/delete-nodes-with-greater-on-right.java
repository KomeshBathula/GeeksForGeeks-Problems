/* Structure of linked list node
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
            
    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    
    Node compute(Node head) {
        // code here
        /*
        
        Node dummyNode = new Node(-1);
        Node temp = head;
        
        while (temp.next != null) {
            if (temp.data < temp.next.data) {
                dummyNode.next = temp.next;
                dummyNode = temp;
            }
            
            temp = temp.next;
        }
        
        return dummyNode.next;
        */
        

        head = reverse(head);

        Node curr = head;
        int max = curr.data;

        while (curr != null && curr.next != null) {
            if (curr.next.data < max) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                max = curr.data;
            }
        }
        
        return reverse(head);
    }
    
}
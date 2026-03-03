/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public Node delNode(Node root, int x) {
        // code here
        Node curr = root, par = null;
        while (curr != null && curr.data != x) {
            par = curr;
            if (x < curr.data) curr = curr.left;
            else curr = curr.right;
        }
        if (curr == null) return root;
        
        // case 1 with no sub childs
        if (curr.left == null && curr.right == null) {
            if (par == null)// it is root node and it's a leaf
                return null;
            // link removals 
            if (par.left == curr) par.left = null;
            else par.right = null;
        }
        // case 2 with single child on right sub tree
        else if (curr.left == null) {
            if (par == null) {
                root = curr.right;
                return root;
            }
            if (par.left == curr) par.left = curr.right;
            else par.right = curr.right;
        }
        else if (curr.right == null) {
            if (par == null) {
                root = curr.left;
                return root;
            }
            if (par.left == curr) par.left = curr.left;
            else par.right = curr.left;
        }
        else {
            Node p = null, p1 = curr.right;
            while (p1.left != null) {
                p = p1;
                p1 = p1.left;
            }
            curr.data = p1.data;
            if (p == null) curr.right = p1.right;
            else p.left = p1.right;
        }
        return root;
    }
}
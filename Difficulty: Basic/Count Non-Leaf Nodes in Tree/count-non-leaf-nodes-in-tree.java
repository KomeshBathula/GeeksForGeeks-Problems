/*class Node
{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/

// function should return the count of total number of non leaf nodes in the tree.
class Solution {
    int countNonLeafNodes(Node root) {
        // code here
        return preOrder(root);
    }
    private static int preOrder(Node temp) {
        if (temp == null) return 0;
        if (temp.left == null && temp.right == null) return 0;
        return 1 + preOrder(temp.left) + preOrder(temp.right);
    }
}
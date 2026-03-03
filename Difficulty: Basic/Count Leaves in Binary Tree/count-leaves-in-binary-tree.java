/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    int countLeaves(Node node) {
        // Your code
        return preOrder(node);
    }
    private static int preOrder(Node temp) {
        if (temp == null) return 0;
        if (temp.left == null && temp.right == null) return 1;
        return preOrder(temp.left) + preOrder(temp.right);
    }
}
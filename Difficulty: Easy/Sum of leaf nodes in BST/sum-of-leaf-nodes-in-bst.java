/*node class of the binary ssearch tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class Solution {
    public static int sumOfLeafNodes(Node root) {
        // code here
        return postOrder(root);
    }
    private static int postOrder(Node temp) {
        if (temp == null) return 0;
        if (temp.left == null && temp.right == null) return temp.data;
        return postOrder(temp.left) + postOrder(temp.right);
    }
}
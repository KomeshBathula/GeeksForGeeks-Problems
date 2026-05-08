/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/
class Solution {
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    
    private void inorder1(Node root) {
        if (root == null) return;
        inorder1(root.left);
        sb1.append(root.data);
        inorder1(root.right);
    }
    
    private void inorder2(Node root) {
        if (root == null) return;
        inorder2(root.left);
        sb2.append(root.data);
        inorder2(root.right);
    }
    public boolean isSubTree(Node root1, Node root2) {
        // code here
        inorder1(root1);
        inorder2(root2);
        return sb1.toString().indexOf(sb2.toString()) != -1;
    }
}
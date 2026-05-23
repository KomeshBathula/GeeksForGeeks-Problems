/* Structure for Tree Node
class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/
class Solution {
    private int helper(Node temp) {
        if (temp == null) return 0;
        
        int old_val = temp.data;
        
        temp.data = helper(temp.left) + helper(temp.right);
        
        return temp.data + old_val;
    }
    
    public void toSumTree(Node root) {
        // code here
        helper(root);
    }
}
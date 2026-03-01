/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> list = new ArrayList<>();
        traversal(root, list);
        return list;
    }
    private static void traversal(Node root, ArrayList<Integer> list) {
        if (root == null) return;
        list.add(root.data);
        traversal(root.left, list);
        traversal(root.right, list);
    }
}
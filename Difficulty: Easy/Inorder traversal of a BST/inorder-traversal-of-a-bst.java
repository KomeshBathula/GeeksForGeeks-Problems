class Tree {
    // Function to return a list containing the inorder traversal of the BST.
    ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        traversal(root, list);
        return list;
    }
    private static void traversal(Node root, ArrayList<Integer> list) {
        if (root == null) return;
        traversal(root.left, list);
        list.add(root.data);
        traversal(root.right, list);
    }
}
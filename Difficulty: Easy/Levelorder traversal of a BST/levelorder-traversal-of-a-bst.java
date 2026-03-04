class Solution {
    // Function to return the level order traversal of a BST.
    static ArrayList<Integer> levelOrder(Node node) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        while (!q.isEmpty()) {
            for (int i = 0; i < q.size(); i++) {
                Node p = q.poll();
                result.add(p.data);
                if (p.left != null) q.offer(p.left);
                if (p.right != null) q.offer(p.right);
            }
        }
        return result;
    }
}
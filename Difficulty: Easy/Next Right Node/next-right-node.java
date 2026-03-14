class Solution {
    Node nextRight(Node root, int key) {
        // Write your code here
        if (root == null) return new Node(-1);
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                Node p = q.poll();
                if (p.data == key) {
                    if (i != n - 1) return q.poll();
                    else return new Node(-1);
                }
                if (p.left != null) q.offer(p.left);
                if (p.right != null) q.offer(p.right);
            }
            
        }
        return new Node(-1);
    }
}
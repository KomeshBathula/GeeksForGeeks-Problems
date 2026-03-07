class Solution {
    /* Returns level of given data value */
    int getLevel(Node node, int data) {
        // Write your code here
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        int level = 0;
        while (!q.isEmpty()) {
            int n = q.size();
            level++;
            for (int i = 1; i <= n; i++) {
                Node p = q.poll();
                if (p.data == data) return level;
                if (p.left != null) q.offer(p.left);
                if (p.right != null) q.offer(p.right);
            }
        }
        return 0;
    }
}
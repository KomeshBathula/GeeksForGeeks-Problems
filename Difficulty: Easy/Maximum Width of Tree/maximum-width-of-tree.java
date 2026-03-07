/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    int maxWidth(Node root) {
        //  code here
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int maxWidth = -1;
        while (!q.isEmpty()) {
            int n = q.size();
            maxWidth = Math.max(maxWidth, n);
            for (int i = 1; i <= n;i++) {
                Node p = q.poll();
                if (p.left != null) q.offer(p.left);
                if (p.right != null) q.offer(p.right);
            }
        }
        return maxWidth;
    }
}
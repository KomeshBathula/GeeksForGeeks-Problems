class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        if (!q.isEmpty()) {
            int el = q.poll();
            reverseQueue(q);
            q.add(el);
        }
    }
}
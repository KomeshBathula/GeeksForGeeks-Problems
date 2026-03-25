class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        // recursion won't work here 
        /*
        if (k <= q.size()) {
            for (int i = 0; i < k; i++) {
                int x = q.poll();
                return reverseFirstK(q, k);
                q.offer(x);
            }
        }
        for (int i = 0; i < q.size() - k; i++) {
            int x = q.poll();
            return reverseFirstK(q, k);
            q.offer(x);
        }
        return q;
        */
        if (k > q.size() || k <= 0) return q;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) 
            st.push(q.poll());
        while (!st.isEmpty()) {
            q.offer(st.pop());
        }
        for (int i = 0; i < q.size() - k; i++) {
            q.offer(q.poll());
        }
        return q;
    }
}
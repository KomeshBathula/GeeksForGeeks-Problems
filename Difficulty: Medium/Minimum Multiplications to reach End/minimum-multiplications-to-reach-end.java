class Solution {
    public int minSteps(int[] arr, int start, int end) {
        // code here
        // base case 
        if (start == end) return 0;
        
        int[] dist = new int[1000];
        Arrays.fill(dist, (int)1e9);
        
        Queue < int[] > q = new LinkedList <>();
        q.add(new int[] {start, 0});
        
        dist[start] = 0;
        int mod = 1000;
        
        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int node = temp[0];
            int steps = temp[1];
            
            for (int val : arr) {
                int newNum = (val * node) % mod;
                
                if (steps + 1 < dist[newNum]) {
                    dist[newNum] = steps + 1;
                    if (newNum == end) return steps + 1;
                    q.add(new int[] {newNum, steps + 1});
                }
            }
        }
        
        return -1;
    }
}
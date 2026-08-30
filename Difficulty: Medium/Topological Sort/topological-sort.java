class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // first create inner lists 
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        // create adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
        }
        
        // Kahn's algorithm using BFS and indegree array
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int ad : adj.get(i)) 
                indegree[ad]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) 
                q.add(i);
        }
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        int i = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            answer.add(node);
            
            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) 
                    q.add(it);
            }
        }
        
        return answer;
    }
}
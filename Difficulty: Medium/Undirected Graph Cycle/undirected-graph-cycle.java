class Solution {
    private boolean checkForCycleUsingDFS(int src, int parent,  List<List<Integer>> adj, boolean[] vis) {
        vis[src] = true;

        for (int adjNode : adj.get(src)) {
            if (!vis[adjNode]) {
                if (checkForCycleUsingDFS(adjNode, src, adj, vis))
                    return true;
            }

            else if (adjNode != parent) return true;
        }

        return false;
    }
    
    public boolean isCycle(int V, int[][] edges) {
        // Create adj list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (checkForCycleUsingDFS(i, -1, adj, vis)) return true;
            }
        }

        return false;
    }
}
class Solution {
    private boolean dfs(int node, int col, int[] color, List<List<Integer>> adj) {
        color[node] = col;

        for (int adjNode : adj.get(node)) {
            if (color[adjNode] == -1) {
                if (!dfs(adjNode, 1 - col, color, adj)) 
                    return false;
            }

            else if (color[adjNode] == col) return false;
        }

        return true;
    }
    
    public boolean isBipartite(int V, int[][] edges) {
        // Code here
        int[] color = new int[V];
        for (int i = 0; i < V; i++) color[i] = -1;

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (!dfs(i, 0, color, adj))
                    return false;
            }
        }

        return true;
        
    }
}
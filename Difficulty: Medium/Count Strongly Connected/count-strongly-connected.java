class Solution {
    // Function to find number of strongly connected components in the graph
    private void dfsToSort(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, Stack<Integer> st) {
        visited[node] = true;

        for (Integer it : adj.get(node)) {
            if (!visited[it])
                dfsToSort(it, visited, adj, st);
        }

        st.push(node);
    }

    private void dfsToCount(int node, ArrayList<ArrayList<Integer>> adjT, boolean[] visited) {
        visited[node] = true;
        for (Integer it : adjT.get(node)) {
            if (!visited[it]) 
                dfsToCount(it, adjT, visited);
        }
    }

    public int kosaraju(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
        
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();
        // sort the graph 

        for (int i = 0; i < V; i++) {
            if (!visited[i]) 
                dfsToSort(i, visited, adj, st);
        }

        // reverse the graph

        ArrayList<ArrayList<Integer>> adjT = new ArrayList<>();
        for (int i = 0; i < V; i++) adjT.add(new ArrayList<>());

        for (int i = 0; i < V; i++) {
            visited[i] = false;
            for (Integer it : adj.get(i))
                adjT.get(it).add(i);
        }

        // do a dfs in the graph
        int scc = 0;
        while (!st.isEmpty()) {
            int node = st.pop();
            if (!visited[node]) {
                scc++;
                dfsToCount(node, adjT, visited);
            }
        }

        return scc;
    }
}
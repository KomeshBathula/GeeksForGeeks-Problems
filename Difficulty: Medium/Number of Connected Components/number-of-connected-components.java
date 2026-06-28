class Solution {
    
    private static void DFS(boolean[] visited, int node, ArrayList<ArrayList<Integer>> edgeList) {
        visited[node] = true;
        for (int adjNode : edgeList.get(node)) {
            if (!visited[adjNode]) 
                DFS(visited, adjNode, edgeList);
        }
    }
    
    int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
        // code here
        // make an arraylist
        ArrayList<ArrayList<Integer>> edgeList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            edgeList.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.size(); i++) {
            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);
            edgeList.get(u).add(v);
            edgeList.get(v).add(u);
        }

        boolean[] visited = new boolean[V];
        int count = 0;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                count++;
                DFS(visited, i, edgeList);
            }
        }

        return count;
    }
}
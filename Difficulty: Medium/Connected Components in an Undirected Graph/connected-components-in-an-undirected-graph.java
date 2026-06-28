class Solution {
    private static void DFS(boolean[] visited, int node, ArrayList<ArrayList<Integer>> edgeList, 
                            ArrayList<Integer> list) {
        visited[node] = true;
        list.add(node);
        for (int adjNode : edgeList.get(node)) {
            if (!visited[adjNode]) 
                DFS(visited, adjNode, edgeList, list);
        }
    }
    
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        // make an arraylist
        ArrayList<ArrayList<Integer>> edgeList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            edgeList.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            edgeList.get(u).add(v);
            edgeList.get(v).add(u);
        }

        boolean[] visited = new boolean[V];
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                ArrayList<Integer> list = new ArrayList<>();
                DFS(visited, i, edgeList, list);
                answer.add(list);
            }
        }

        return answer;
    }
}
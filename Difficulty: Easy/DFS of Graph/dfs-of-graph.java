class Solution {
    private void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans) {
        vis[node] = true;
        ans.add(node);
        
        for (Integer i : adj.get(node)) {
            if (!vis[i]) {
                dfs(i, vis, adj, ans);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] vis = new boolean[adj.size()];
        vis[0] = true;
        ArrayList<Integer> ans = new ArrayList<>();
        
        dfs(0, vis, adj, ans);
        
        return ans;
    }
}
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                if(dfs(V, adj, vis, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(int V, ArrayList<ArrayList<Integer>> adj, boolean vis[], int cur, int p){
        vis[cur] = true;
        
        for(int i = 0; i < adj.get(cur).size(); i++){
            int r = adj.get(cur).get(i);
            if(!vis[r]){
                if(dfs(V, adj, vis, r, cur)){
                    return true;
                }
            }
            else if(p != r && vis[r]){
                return true;
            }
        }
        return false;
    }
}
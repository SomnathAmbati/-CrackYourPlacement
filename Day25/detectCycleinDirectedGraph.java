class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        boolean recst[] = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                if(dfsUtil(V, adj, vis, recst, i)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfsUtil(int V, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] recst, int cur){
        vis[cur] = true;
        recst[cur] = true;
        
        for(int i = 0; i < adj.get(cur).size(); i++){
            int r = adj.get(cur).get(i);
            if(recst[r]){
                return true;
            }
            if(!vis[r]){
                if(dfsUtil(V, adj, vis, recst, r)){
                    return true;
                }
            }
        }
        recst[cur] = false;
        return false;
    }
}
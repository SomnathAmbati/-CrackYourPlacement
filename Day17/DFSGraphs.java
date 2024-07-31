class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> l = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Dfs(adj, V, 0, vis, l);
        return l;
    }
    public static void Dfs(ArrayList<ArrayList<Integer>> adj, int V, int cur, boolean[] vis, ArrayList<Integer> l){
        l.add(cur);
        vis[cur] = true;
        
        for(int i = 0; i < adj.get(cur).size(); i++){
            if(!vis[adj.get(cur).get(i)]){
                Dfs(adj, V, adj.get(cur).get(i), vis, l);
            }
        }
    }
}
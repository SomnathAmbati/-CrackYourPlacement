class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        ArrayList<Integer> l = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int cur = q.remove();
            if(!vis[cur]){
                vis[cur] = true;
                l.add(cur);
                for(int i = 0; i < adj.get(cur).size(); i++){
                    q.add(adj.get(cur).get(i));
                }
            }
        }
        return l;
  
    }
}
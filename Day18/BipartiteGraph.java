class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int col[] = new int[V];
        Arrays.fill(col, -1);
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < V; i++){
            q.add(i);
            if(col[i] == -1){
                col[i] = 0;
            }
            while(!q.isEmpty()){
                int cur = q.remove();
                for(int j = 0; j < adj.get(cur).size(); j++){
                    int d = adj.get(cur).get(j);
                    if(col[d] == -1){
                        col[d] = col[cur] == 0? 1 : 0;
                        q.add(d);
                    }
                    else if(col[d] == col[cur]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
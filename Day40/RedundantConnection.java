class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for(int i = 0; i < edges.length+1; i++)   l.add(new ArrayList<>());
        for(int[] e : edges){
            l.get(e[0]).add(e[1]);
            l.get(e[1]).add(e[0]);
            boolean[] vis = new boolean[edges.length+1];
            for(int i = 0; i < vis.length; i++){
                if(!vis[i]){
                    if(iscycle(l, i, -1, vis)){
                        return e ;
                    }
                }
            }
        }
        return new int[0];
    }
    public static boolean iscycle(ArrayList<ArrayList<Integer>> l, int cur, int par, boolean[] vis){
        vis[cur] = true;
        
        for(int i = 0; i < l.get(cur).size(); i++){
            int d = l.get(cur).get(i);

            if(vis[d] && d != par){
                return true;
            }
            else if(!vis[d]){
                if(iscycle(l, d, cur, vis)){
                    return true;
                }
            }
        }
        return false;
    }
}
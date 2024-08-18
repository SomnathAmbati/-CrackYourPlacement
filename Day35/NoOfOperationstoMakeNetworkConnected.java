class Solution {
    public int makeConnected(int n, int[][] c) {
        if (c.length < n - 1) {
            return -1;
        }
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for(int i = 0; i < n; i++)  l.add(new ArrayList<>());
        for(int i = 0; i < c.length; i++){
            l.get(c[i][0]).add(c[i][1]);
            l.get(c[i][1]).add(c[i][0]);
        }
        int cnt = 0;
        boolean[] vis = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!vis[i]){
                dfs(l, i, vis);
                cnt++;
            }
        }
        return cnt-1;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> l, int cur, boolean[] vis){
        vis[cur] = true;

        for(int i = 0; i < l.get(cur).size(); i++){
            int d = l.get(cur).get(i);
            if(!vis[d]){
                dfs(l, d, vis);
            }
        }
    }
}
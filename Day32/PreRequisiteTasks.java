class Solution {
    public boolean isPossible(int N,int P, int[][] pr)
    {
        boolean vis[] = new boolean[N];
        boolean recst[] = new boolean[N];
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for(int i = 0; i < N; i++)  l.add(new ArrayList<>());
        for(int i = 0; i < P; i++){
           int s = pr[i][0];
           int d = pr[i][1];
           l.get(s).add(d);
        }
        for(int i = 0; i < N; i++){
            if(!vis[i]){
                if(detect(vis, recst, i, l)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean detect(boolean[] vis, boolean[] recst, int cur, ArrayList<ArrayList<Integer>> l){
        vis[cur] = true;
        recst[cur] = true;
        
        for(int i = 0; i < l.get(cur).size(); i++){
            int d = l.get(cur).get(i);
        if(recst[d])    return true;
            if(!vis[d]){
                if(detect(vis, recst, d, l)){
                    return true;
                }
            }
        }
        recst[cur] = false;
        return false;
    }
}
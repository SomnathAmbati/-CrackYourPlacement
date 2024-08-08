
class Solution {
    static class Pair implements Comparable<Pair>{
        int n, w;
        Pair(int n, int w){
            this.n  = n;
            this.w = w;
        }
        public int compareTo(Pair p2){
            return this.w - p2.w;
        }
    }
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int tc = 0;
        boolean []vis = new boolean[V];
        while(!pq.isEmpty()){
            Pair r = pq.remove();
            if(!vis[r.n]){
                tc += r.w;
                vis[r.n] = true;
                for(int j = 0; j < adj.get(r.n).size(); j++){
                    int[] a = adj.get(r.n).get(j);
                    pq.add(new Pair(a[0], a[1]));
                }
            }
        }
        return tc;
    }
}
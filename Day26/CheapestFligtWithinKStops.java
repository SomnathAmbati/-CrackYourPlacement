class Solution {
    public static class Edge{
        int s, d, w;
        public Edge(int s, int d, int w){
            this.s = s;
            this.d = d;
            this.w = w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[], int V, int[][] f){
        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < f.length; i++){
            graph[f[i][0]].add(new Edge(f[i][0], f[i][1], f[i][2]));
        }
    }
    public static class Info{
        int v, cost, s;
        Info(int v, int cost, int s){
            this.v = v;
            this.cost = cost;
            this.s = s;
        }
    }
    public int findCheapestPrice(int n, int[][] f, int src, int dst, int k) {
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph, n, f);
        Queue<Info> q = new LinkedList<>();
        int dis[] = new int[n];
        for(int i = 0; i < n; i++){
            if(i != src)    dis[i] = Integer.MAX_VALUE;
        }
        q.add(new Info(src, 0, 0));
        int tc = 0;
        while(!q.isEmpty()){
            Info r = q.remove();
            if(r.s > k){
                break;
            }
            for(int i = 0; i < graph[r.v].size(); i++){
                    Edge e = graph[r.v].get(i);
                    int u = e.s;
                    int v = e.d;
                    int w = e.w;
                    if(r.s <= k && r.cost + w < dis[v]){
                        dis[v] = r.cost + w;
                        q.add(new Info(v, dis[v], r.s + 1));
                    }
            }            
        }
        return dis[dst] != Integer.MAX_VALUE? dis[dst] : -1;
    }
}
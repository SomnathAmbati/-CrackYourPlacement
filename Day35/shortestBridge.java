class Solution {
    public int shortestBridge(int[][] g) {
        boolean t = false;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < g.length; i++){
            if(t)   break;
            for(int j = 0; j < g[0].length; j++){
                if(g[i][j] == 1){
                    dfs(g, i, j, q);
                    t = true;
                    break;
                }
            }
        }
        int steps = 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                for (int[] dir : directions) {
                    int x = cur[0] + dir[0];
                    int y = cur[1] + dir[1];
                    if (x >= 0 && y >= 0 && x < g.length && y < g[0].length) {
                        if (g[x][y] == 1) {
                            return steps; 
                        }
                        if (g[x][y] == 0) {
                            g[x][y] = 2; 
                            q.offer(new int[]{x, y});
                        }
                    }
                }
            }
            steps++;
        }

        return -1; 
        
    }
    public static void dfs(int[][] g, int i, int j, Queue<int[]> q){
        if(i < 0 || j < 0 || i >= g.length || j >= g[0].length || g[i][j] != 1){
            return;
        }
        g[i][j] = 2;
        q.add(new int[]{i, j});
        dfs(g, i+1, j, q);
        dfs(g, i-1, j, q);
        dfs(g, i, j+1, q);
        dfs(g, i, j-1, q);
    }
}
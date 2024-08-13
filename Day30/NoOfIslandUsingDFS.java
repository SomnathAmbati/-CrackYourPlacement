class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] g) {
        int c = 0;
        for(int i = 0; i < g.length; i++){
            for(int j = 0; j < g[0].length; j++){
                if(g[i][j] == '1'){
                    dfs(g, i, j);
                    c++;
                }
            }
        }
        return c;
    }
    public static void dfs(char[][] g, int i, int j){
        if(i < 0 || j < 0 || i >= g.length || j >= g[0].length || g[i][j] != '1'){
            return;
        }
        
        g[i][j] = '2';
        dfs(g, i+1, j);
        dfs(g, i-1, j);
        dfs(g, i, j+1);
        dfs(g, i, j-1);
        dfs(g, i+1, j+1);
        dfs(g, i-1, j+1);
        dfs(g, i+1, j-1);
        dfs(g, i-1, j-1);
    }
}
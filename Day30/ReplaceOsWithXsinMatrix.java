class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 || j == 0 || i == n-1 || j == m - 1){
                    if(a[i][j] == 'O'){
                        dfs(a, i, j, n, m);
                    }
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(a[i][j] == 'O'){
                    a[i][j] = 'X';
                }else if(a[i][j] == 'Y'){
                    a[i][j] = 'O';
                }
            }
        }
        return a;
    }
    public static void dfs(char[][] a, int i, int j, int n, int m){
        if(i < 0 || j < 0 || i >= n || j >= m || a[i][j] != 'O'){
            return;
        }
        
        a[i][j] = 'Y';
        dfs(a, i+1, j, n, m);
        dfs(a, i, j+1, n, m);
        dfs(a, i-1, j, n, m);
        dfs(a, i, j-1, n, m);
    }
}
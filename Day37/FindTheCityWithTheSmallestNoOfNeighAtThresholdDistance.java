class Solution {
    public int findTheCity(int n, int[][] e, int dt) {
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j){
                    dp[i][j] = Integer.MAX_VALUE/2;
                }
            }
        }
        for(int i = 0; i < e.length; i++){
            dp[e[i][0]][e[i][1]] = e[i][2];
            dp[e[i][1]][e[i][0]] = e[i][2];
        }
        
        for(int k = 0; k < n; k++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
                }
            }
        } 
        int s = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int c = 0;
            for(int j = 0; j < n; j++){
                if(i != j && dp[i][j] <= dt){
                    c++;    
                }
            }
            if(min >= c){
                min = c;
                s = i;
            }
        }
        return s;
    }
}
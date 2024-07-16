class Solution {
    public void setZeroes(int[][] m) {
        int r = m.length;
        int c = m[0].length;
        boolean[][] d = new boolean[r][c];
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                if(d[i][j] == false && m[i][j] == 0){
                    int x = i, y = 0;
                    while(y < c){
                        if(m[x][y] != 0){
                            d[x][y] = true;
                            m[x][y] = 0;     
                        }
                        y++;
                    }
                    x = 0; y = j;
                    while(x < r){
                        if(m[x][y] != 0){
                            d[x][y] = true;
                            m[x][y] = 0;   
                        }
                        x++;
                    }
                }
            }
        }
    }
}
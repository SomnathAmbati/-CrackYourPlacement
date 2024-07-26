class Solution {
    public void gameOfLife(int[][] b) {
        int r = b.length;
        int co = b[0].length;
        int[][] m = new int[r][co];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < co; j++){
                int c = 0;
                if(i-1 >=0 && j-1 >= 0 && b[i-1][j-1] == 1){
                    c++;
                }
                if(i-1 >= 0 && b[i-1][j] == 1){
                    c++;
                }
                if(i-1 >= 0 && j+1 < co && b[i-1][j+1] == 1){
                    c++;
                }
                if(j-1 >= 0 && b[i][j-1] == 1){
                    c++;
                }
                if(j+1 < co && b[i][j+1] == 1){
                    c++;
                }
                if(i+1 < r && j-1 >= 0 && b[i+1][j-1] == 1){
                    c++;
                }
                if(i+1 < r && b[i+1][j] == 1){
                    c++;
                }
                if(i+1 < r && j+1 < co && b[i+1][j+1] == 1){
                    c++;
                }

                if(b[i][j] == 0 && c == 3){
                    m[i][j] = 1;
                }
                else if(b[i][j] == 1 && c < 2 || b[i][j] == 1 && c > 3){
                    m[i][j] = 0;
                }
                else{
                    m[i][j] = b[i][j];
                }
            }
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < co; j++){
                b[i][j] = m[i][j];
            }
        }
    }
}
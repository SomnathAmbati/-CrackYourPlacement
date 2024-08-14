class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                if(grid[i][j]=='1'){
                    change(i,j,grid);
                    count+=1;
                }
            }
        }

        return count;
    }

    public void change(int r , int c , char[][] grid){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c] !='1')   return;
        
        grid[r][c]='2';

        // top
        change(r-1 , c ,grid);
        // right
        change(r , c+1 ,grid);
        // bottom
        change(r+1 , c ,grid);
        // left
        change(r , c-1 ,grid);
    }
}
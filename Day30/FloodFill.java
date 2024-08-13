class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int c) {
        if(image[sr][sc] != c){
            dfs(image, sr, sc, image[sr][sc], c);
        }
        return image;
    }
    public static void dfs(int[][] image, int sr, int sc, int i, int c){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] == c || image[sr][sc] != i){
            return;
        }
        image[sr][sc] = c;
        dfs(image, sr+1, sc, i, c);
        dfs(image, sr-1, sc, i, c);
        dfs(image, sr, sc+1, i, c);
        dfs(image, sr, sc-1, i, c);
    }
}
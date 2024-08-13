class Solution {
    public ArrayList<String> findPath(int[][] m) {
        ArrayList<String> l = new ArrayList<>();
        int r = m.length-1;
        int c = m[0].length-1;
        boolean[][] vis = new boolean[r+1][c+1];
        sol(0, 0, m, "", r, c, vis, l);
        return l;
    }
    public static void sol(int i, int j, int[][] m, String s, int r, int c, boolean[][] vis, ArrayList<String> l){
        if(i < 0 || j < 0 || i > r || j > c || m[i][j] == 0 || vis[i][j])    return;
        
        if(i == r && j == c){
            l.add(s);
            return;
        }
        vis[i][j] = true;
        
        sol(i-1, j, m, s+"U", r, c, vis, l);
        sol(i, j-1, m, s+"L", r, c, vis, l);
        sol(i, j+1, m, s+"R", r, c, vis, l);
        sol(i+1, j, m, s+"D", r, c, vis, l);
        
        vis[i][j] = false;
    }
}
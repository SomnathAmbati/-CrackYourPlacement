class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        ArrayList l = new ArrayList();
        int sc = 0, sr = 0;
        int er = m.length-1, ec = m[0].length-1;
        while(sr <= er && sc <= ec){
            //top
            for(int j = sc; j <= ec; j++){
                l.add(m[sr][j]);
            }
            //right
            for(int i = sr+1; i <= er; i++){
                l.add(m[i][ec]);
            }
            //bottom
            for(int j = ec-1; j >= sc; j--){
                if(sr == er){
                    break;
                }
                l.add(m[er][j]);
            }
            //left
            for(int i = er-1; i >= sr+1; i--){
                if(sc == ec){
                    break;
                }
                l.add(m[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        return l;
    }
}
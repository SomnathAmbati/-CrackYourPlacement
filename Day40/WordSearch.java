class Solution {
    public boolean exist(char[][] b, String w) {
        if(w.length() < 1)  return false;
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[0].length; j++){
                if(b[i][j] == w.charAt(0)){
                    if(sol(b, i, j, w, 0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean sol(char[][] b, int i, int j, String w, int ind){
        if(ind == w.length())   return true;
        if(i < 0 || j < 0 || i >= b.length || j >= b[0].length || b[i][j] != w.charAt(ind)){
            return false;
        }

        char t = b[i][j];
        b[i][j] = '-';
        boolean found = sol(b, i+1, j, w, ind+1) ||
                    sol(b, i, j+1, w, ind+1) ||
                    sol(b, i, j-1, w, ind+1) ||
                    sol(b, i-1, j, w, ind+1);
        b[i][j] = t;

        return found;
    }
}
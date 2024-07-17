class Solution {
    public int findMaxValueOfEquation(int[][] p, int k) {
        int max = Integer.MIN_VALUE;
        int f = 1;
        for(int i = 0; i < p.length-1; i++){
            if(f < i+1){
                f = i+1;
            }
            for(int j = f; j < p.length; j++){
                int t = Math.abs(p[i][0] - p[j][0]);
                if(t <= k){
                    int ans = p[i][1] + p[j][1] + t;
                    if(ans > max){
                        max = ans;
                        f = j-1;
                    }
                }else{
                    break;
                }
            }
        }
        return max;
    }
}
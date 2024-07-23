class Solution {
    public int maxScore(int[] c, int k) {
        int s = 0;
        for(int i = 0; i < k; i++){
            s += c[i];
        }

        int ans = s;

        for(int i = k-1; i >= 0; i--){
            s -= c[i];
            s += c[c.length - k + i];

            ans = Math.max(s, ans);
        }
        return ans;
    }
}
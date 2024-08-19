class Solution {
    public int nthUglyNumber(int n) {
        int i1 = 0, i2 = 0, i3 = 0;
        int n1 = 2, n2 = 3, n3 = 5;
        int[] ans = new int[n];
        ans[0] = 1;
        for(int i = 1; i < n; i++){
            int next = Math.min(n1, Math.min(n2, n3));
            ans[i] = next;
            if(next == n1){
                i1++;
                n1 = 2 * ans[i1];
            }
            if(next == n2){
                i2++;
                n2 = 3 * ans[i2];
            }
            if(next == n3){
                i3++;
                n3 = 5 * ans[i3];
            }
        }
        return ans[n-1];
    }
}
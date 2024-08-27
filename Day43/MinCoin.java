class Solution {
    public int MinCoin(int[] n, int a) {
        int[] dp = new int[a + 1];
        Arrays.fill(dp, a + 1);
        dp[0] = 0; 

        for (int coin : n) {
            for (int j = coin; j <= a; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin] + 1);
            }
        }

        return dp[a] > a ? -1 : dp[a];
    }
}
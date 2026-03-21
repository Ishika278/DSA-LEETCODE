class Solution {
    private int solve(int n, int[] dp) {
        if (n == 0) return 1;
        if (n < 0) return 0;

        if (dp[n] != 0){
        return dp[n];
        }
        int take1 = solve(n - 1, dp);
        int take2 = solve(n - 2, dp);
        dp[n] = (take1 + take2);
        return dp[n]; 
    }
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return solve(n, dp);
    }
}
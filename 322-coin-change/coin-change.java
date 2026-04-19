class Solution {
    public static int solve(int[] coin, int sum, int i, int[][] dp)
    {
        if(sum == 0) return 0;
        if(sum < 0 || i == coin.length) return 99999;

        if(dp[i][sum] != -1)
        {
        return dp[i][sum];
        }

        int take = 1 + solve(coin, sum - coin[i], i, dp);
        int nottake = solve(coin, sum, i+1, dp);

        dp[i][sum] = Math.min(take, nottake);

        return dp[i][sum];

    }
    public int coinChange(int[] coins, int amount) {
       int n = coins.length;
       int[][] dp = new int[n][amount + 1];
       for(int i = 0; i< n; i++)
       {
        for(int j = 0; j < amount + 1; j++)
        {
          dp[i][j] = -1;
        }
       }

       int ans = solve(coins, amount, 0, dp);
       if(ans >= 99999) return -1;
       return ans; 
    }
}
class Solution {
    public static int solve(int[] nums, int i, int [] dp)
    {
        if(i >= nums.length) return 0;
        if(dp[i] != -1)
        {
            return dp[i];//
        }
        int take = nums[i] + solve(nums, i+2, dp);
        int nottake = solve(nums, i+1, dp);
 
        dp[i] = Math.max(take, nottake);
        return dp[i]; 
    }
    public int rob(int[] nums) {
      int n = nums.length;
      int [] dp = new int [n];
      
      for(int i = 0; i < n; i++)
       {
        dp[i] = -1;
       }

        return solve (nums,0,dp);
        
    }
}
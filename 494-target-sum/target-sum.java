class Solution {
    public static int solve(int[] arr, int sum, int i)
    {
        if(i == arr.length){
            if(sum == 0) return 1;
            return 0;
        }
      int take = 0;
      if(sum >= arr[i])
     {
      take = solve(arr, sum - arr[i], i +1);
     }
        int nottake = solve(arr,sum, i+1);
        return take + nottake;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int totalsum = 0;
        for(int num : nums)
        {
            totalsum+= num;
        }
        int sum = (totalsum + target)/2;
        if((totalsum + target) % 2 != 0) return 0;
        if(target > totalsum) return 0;

        return solve(nums, sum, 0);
    }
}
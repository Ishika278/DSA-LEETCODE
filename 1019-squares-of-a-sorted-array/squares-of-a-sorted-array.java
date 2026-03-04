class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int [n];
        //Arrays.sort(nums);

        for(int i = 0; i < n; i++)
        {
           ans[i] = nums[i] * nums[i];
        }
        //sort after square because of -ve values
        Arrays.sort(ans);
        return ans;
    }
}
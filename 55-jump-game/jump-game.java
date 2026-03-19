class Solution {
    public boolean canJump(int[] nums) {
        int max_jump = 0;

        for(int i = 0; i < nums.length; i++)
        {  
            if(i > max_jump) return false;

            max_jump = Math.max(max_jump, i + nums[i]);
        }
        return true;
    }
}
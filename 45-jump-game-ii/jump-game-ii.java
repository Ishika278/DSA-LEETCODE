class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int max_jump = 0;
        int reach_end = 0;

        for(int i = 0; i < nums.length - 1; i++)
        {  
            if(i > max_jump) return -1;
            max_jump = Math.max(max_jump, i + nums[i]);
            //time to make a jump    
            if(i == reach_end){
                jump++;
                reach_end = max_jump;
            }
        }
        return jump;
    }
}
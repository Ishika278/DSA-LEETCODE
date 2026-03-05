class Solution {
    public boolean canAliceWin(int[] nums) {
        
        int single_sum = 0;
        int double_sum = 0;
        int total = 0;

        for(int num : nums){
            total = total +  num;

            if(num < 10)
            {
                single_sum += num;
            }else
            {
                double_sum += num;
            }
        }//alice sum > bob sum
        if(single_sum > total - single_sum) return true;
        //alice sum > bob sum
        if(double_sum > total - double_sum) return true;

        return false;
    }
}
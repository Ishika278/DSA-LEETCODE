class Solution {
    public int removeDuplicates(int[] nums) {
        //2-> first two duplicate elements are allowed 
        int k = 2;

        for(int i = 2; i < nums.length; i++)
        {
            if(nums[i] != nums[k - 2])//at most two duplicates
            {
                //modifying original array in-place
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
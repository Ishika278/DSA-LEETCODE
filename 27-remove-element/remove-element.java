class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i = 0; i < nums.length; i++)
        {
            //[0,1,2,2,3,0,4,2] -> [0,1,_,_,3,0,4,_] -> [0,1,4,0,3,_,_,_]
            if(nums[i] != val)
            {   //in-place array(original) 
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
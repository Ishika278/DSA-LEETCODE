class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        //sort array 
        Arrays.sort(nums);

        for(int i = 0; i < n-2; i++)//n-2 -> need 3 elements from array
        {
            //skip duplicate value of i
            if(i > 0 && nums[i]==nums[i-1]) continue;
            int left = i+1; //just after i
            int right = n-1;
            while(left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0)
                {
                    //to add in new array 
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
        
                    left++;
                    right--;
                    
                    //skip duplicate value of left
                    while(left < right && nums[left] == nums[left - 1]) 
                    left++;
                    //skip duplicate value of right
                    while(left < right && nums[right] == nums[right + 1])
                    right--;
                }
                else if(sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return ans;
    }
}
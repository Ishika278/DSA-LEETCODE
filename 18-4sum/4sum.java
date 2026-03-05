class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        //sort array 
        Arrays.sort(nums);

        for(int i = 0; i < n-3; i++)//n-3 -> need 4 elements from array
        {
             //skip duplicate value of i
            if(i > 0 && nums[i]==nums[i-1]) continue;
            for(int j = i + 1; j < n - 2;  j++)
            {
            //skip duplicate value of i
            if(j > i + 1 && nums[j]==nums[j-1]) continue;
    
            int left = j + 1; //just after i
            int right = n - 1;

            while(left < right)
            {
                long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                if(sum == target)
                {
                    //to add in new array 
                    ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
        
                    left++;
                    right--;
                    
                    //skip duplicate value of left
                    while(left < right && nums[left] == nums[left - 1]) 
                    left++;
                    //skip duplicate value of right
                    while(left < right && nums[right] == nums[right + 1])
                    right--;
                }
                else if(sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
         }
        }
        return ans;
    }
}
class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int elementsum = 0;
        int digitsum = 0;
        
        //for element sum
        for(int i = 0; i < n; i++)
        {
           elementsum += nums[i]; 
    
       //for digitsum
       int num = nums[i];
       while(num > 0)
       {
        digitsum += num % 10;
        num = num / 10;
      //  num++;
       }
         num++;
     }

        return (elementsum - digitsum);
    }
}
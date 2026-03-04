class Solution {
    public int arraySign(int[] nums) {
    int sign = 1;
         for(int num : nums)
        {
          if(num == 0) return 0;
          //for negative product
           if (num < 0 ){
            sign = -sign;
           }
        }
         return sign;
    }
}
   
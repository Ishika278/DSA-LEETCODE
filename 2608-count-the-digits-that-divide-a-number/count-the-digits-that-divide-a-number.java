class Solution {
    public int countDigits(int num) {
       int original = num;
       int val = 0;
     
        while(num > 0)
        {
            int digit = num % 10;

            if(original % digit == 0){
                val++;
           // return val;
        }
         num = num / 10;
      }
      return val;
    }
}
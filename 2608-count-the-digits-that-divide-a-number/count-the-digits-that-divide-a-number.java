class Solution {
    public int countDigits(int num) {
       int original = num;
       int val = 0;
     
        while(num > 0)
        {   //for last digit 
            int digit = num % 10; 

            if(original % digit == 0){
                val++;
           // return val;
         } //to remove last digit
          num = num / 10;
      }
      return val;
    }
}
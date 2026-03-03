class Solution {
    public int addDigits(int num) {
       if(num < 10) return num;//for single digit
       while(num >= 10) //to check more than 1 digit
       {
        int sum = 0;
        while(num > 0)
        {
            sum = sum + num % 10;
            num = num / 10;
        }
        num = sum;
       }
       return num;
    }
}
class Solution {
    public int differenceOfSums(int n, int m) {
        int diff = 0;
        int num1 = 0, num2 = 0;
        for(int i = 0; i <= n; i++)
        {
           if(i % m != 0)
           {
             num1 = num1 + i;
           }
        }
        for(int j = 0; j <= n; j++)
        {
            if(j % m == 0)
            {
                num2 = num2 + j;
            }
        }
        diff = num1 - num2;
        return diff;
    }
}
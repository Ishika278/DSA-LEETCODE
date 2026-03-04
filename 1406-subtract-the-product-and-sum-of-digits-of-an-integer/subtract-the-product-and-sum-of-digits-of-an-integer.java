class Solution {
    public int subtractProductAndSum(int n) {
        if(n == 0) return 0;
        int product = 1;
        int sum = 0;
        
        while(n > 0)
        {
        int num = n % 10;//extract last digit
        product *= num;
        sum += num; 
        n = n / 10;//remove last digit
        }
        return (product - sum);
    }
}
class Solution {
    public int maxProfit(int[] prices) {
    int profit = 0;
    int buy = 99999;

    for(int money : prices)
    {
        buy = Math.min(money, buy);
        profit = Math.max(profit, money - buy);
    }
     return profit;
    }
}
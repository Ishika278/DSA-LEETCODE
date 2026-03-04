class Solution {
    public int maximumWealth(int[][] accounts) {
         int maxwealth = 0;
         int n = accounts.length;
         int m = accounts[0].length; 

         for(int i = 0; i < n; i++)
         {
            int currwealth = 0;

            for(int j = 0; j < m; j++)
            {
                currwealth += accounts[i][j];
            }
            maxwealth = Math.max(currwealth, maxwealth);
         }
          return maxwealth;
    }
}
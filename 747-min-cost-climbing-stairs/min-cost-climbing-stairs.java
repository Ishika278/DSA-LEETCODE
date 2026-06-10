class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;

        int step1 = cost[0];
        int step2 = cost[1];

        for (int i = 2; i < n; i++) {
            int curr = cost[i] + Math.min(step1, step2);
            step1 = step2;
            step2 = curr;
        }

        return Math.min(step1, step2);
    }
}
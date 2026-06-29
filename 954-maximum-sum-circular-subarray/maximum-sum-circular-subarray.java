class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;

        //maximum subarray sum
        int currMax = 0, maxSum = nums[0];

        //minimum subarray sum
        int currMin = 0, minSum = nums[0];

        for (int num : nums) {
            totalSum += num;

            // Kadane for maximum sum
            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            // Kadane for minimum sum
            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);
        }

        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
}
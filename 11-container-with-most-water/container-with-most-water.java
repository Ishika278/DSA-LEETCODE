class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int curArea = 0;
        int maxArea = 0;

        while (left < right) {
            
            int h = Math.min(height[left], height[right]);
            int width = right - left;

            curArea = h * width;
            maxArea = Math.max(maxArea, curArea);

            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }

        return maxArea;
    }
}

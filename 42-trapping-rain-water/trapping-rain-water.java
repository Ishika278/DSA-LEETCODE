class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int i = 0, j = n - 1, area = 0, left_max = 0, right_max = 0;

        while(i < j)
        {
            if(left_max < height[i])
            {
                left_max = height[i];
            }
            if(right_max < height[j])
            {
                right_max = height[j];
            }
            if(left_max < right_max)
            {
                area += (left_max - height[i]) * 1;
                i++;
            }
            else{
                area +=(right_max - height[j]) * 1;
                j--;
            }
        }
        return area;
    }
}
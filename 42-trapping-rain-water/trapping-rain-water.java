class Solution {
    public int trap(int[] height) {

        int  n = height.length,i = 0, j = n-1, leftmax = 0, rightmax = 0, area = 0;
        while(i < j)
        {
            if(leftmax < height[i])
            {
                leftmax = height[i];
            }
            if(rightmax < height[j])
            {
                rightmax = height[j];
            }
            if(leftmax < rightmax)
            {
                area += (leftmax - height[i]) * 1;
                i++;
            }
            else
            {
             area += (rightmax -height[j]) * 1;
             j--;
            }
        }
        return area;
    }
}
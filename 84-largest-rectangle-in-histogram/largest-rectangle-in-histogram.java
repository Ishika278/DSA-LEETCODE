class Solution {
    public int largestRectangleArea(int[] heights) {
       int n = heights.length;
       int[] left = new int[n];
       int[] right = new int[n];

       Stack<Integer> stack = new Stack<>();

       //Nearest smallest  to left
       for(int i = 0; i < n; i++)
       {
        while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
        {
            stack.pop();
        }
        if(stack.isEmpty())
        {
            left[i] = -1;
        }else{
            left[i] = stack.peek();
        }
        stack.push(i);
       }

       //to remove previous values of stack from NSL to use in NSR
       stack.clear();
       //Nearest smallest to right
       for(int i = n-1; i >= 0; i--)
       {
        while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
        {
            stack.pop();
        }
        if(stack.isEmpty())
        {
            right[i] = n;
        }else
        {
            right[i] = stack.peek();
        }
        stack.push(i);
       }
    
        int max_area = 0;
        for(int i = 0; i < n; i++)
        {
            int width = right[i] - left[i] - 1;//width 
            int area = heights[i] * width;

            max_area = Math.max(area, max_area);
        }       
         return max_area;
    }
}
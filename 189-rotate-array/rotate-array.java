class Solution {
    public void rotate(int[] nums, int k) {
      int n = nums.length;
      if(k == 0 || n == 0) return;
      k = k%n;
      reverse(0, n-k-1, nums);
      reverse(n-k, n-1, nums);
      reverse(0, n-1, nums);
    }
       public static void reverse(int i, int j, int[] arr)
       {
        if(i < 0 || j < 0) return;
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
     }
}
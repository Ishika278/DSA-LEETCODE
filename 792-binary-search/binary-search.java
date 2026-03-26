class Solution {
    public static int solve(int low, int high, int target, int[] arr)
    {  
        if(low > high) return -1;

        int mid = low + (high - low)/2;
        if(arr[mid] == target) { 
            return mid;
        }
        else if(target < arr[mid]) {
            return solve(low, mid - 1, target, arr);
        }
        else {
            return solve(mid + 1, high, target, arr);
        }

    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        return solve(0, n-1, target, nums);
    }
}
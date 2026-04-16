class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();

       for(int num : nums)
       {
        pq.offer(num);
        //size of heap is k-> logk not logn optimised
        if(pq.size() > k)
        {
            pq.poll();
        }
       } 
       return pq.peek();
    }
}
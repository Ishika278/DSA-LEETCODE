class pair
{
    int key;
    int freq;
    pair(int key, int freq)
    {
    this.key = key;
    this.freq = freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       PriorityQueue<pair> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.freq, b.freq));

       HashMap<Integer, Integer> map = new HashMap<>();

       for(int num : nums)
       {
        map.put(num, map.getOrDefault(num, 0) + 1);
       } 
       for(int ele : map.keySet())
       {
        pq.offer(new pair(ele, map.get(ele)));
        if(pq.size() > k)
        {
            pq.poll();
        }
       }
       int i = 0;
       int[] ans = new int[k];
       while(!pq.isEmpty())
       {
        ans[i] = pq.poll().key;
        i++;
       }
       return ans;
    }
}
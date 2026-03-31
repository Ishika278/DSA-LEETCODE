class Solution {
     public static void solve(int i, List<List<Integer>>ans, int[] arr, ArrayList temp)
    {
      if(i == arr.length)
      {
        ans.add(new ArrayList(temp));
        return;
      }
        //take
        temp.add(arr[i]);
        solve(i + 1, ans, arr, temp);
   temp.remove(temp.size() - 1);
        //nottake
         int j = i;
        //while(j + 1  < arr.length && arr[j] == arr[j+1]) j++;
        while(j  < arr.length - 1 && arr[j] == arr[j+1]) j++;
        solve(j+1,ans,arr,temp) ;
       
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
      Arrays.sort(nums);
      List<List<Integer>> ans = new ArrayList();
      solve(0,ans,nums,new ArrayList<Integer>());
      return ans;
    }
}
    
        

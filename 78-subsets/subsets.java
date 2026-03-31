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
  
        //nottake
        temp.remove(temp.size() - 1);
        solve(i + 1, ans, arr, temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> ans = new ArrayList();
      solve(0,ans,nums,new ArrayList<Integer>());
      return ans;
    }
}
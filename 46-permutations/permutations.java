class Solution {
    public static void solve(List<List<Integer>> ans, int[] arr, List<Integer> temp)
    {
        if(temp.size() == arr.length){
           ans.add(new ArrayList<>(temp));
        }else{
          for(int i = 0; i < arr.length; i++)
          {
            if(temp.contains(arr[i]))
            continue;
            temp.add(arr[i]);
           //insert in new array
           solve(ans, arr, temp);
           temp.remove(temp.size() - 1);
          }
      }
    }
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans = new ArrayList();
       solve(ans, nums, new ArrayList<Integer>());
       return ans;
    }
}
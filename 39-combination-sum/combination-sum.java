class Solution {
    public static void solve(int i, int[] candidates, int target, List<Integer> curr,List<List<Integer>>ans)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i == candidates.length) return;
        if(target >= candidates[i])
        {
            curr.add(candidates[i]);
            solve(i, candidates, target - candidates[i], curr, ans);
            curr.remove(curr.size() - 1);
        }
        solve(i + 1, candidates, target, curr, ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
}
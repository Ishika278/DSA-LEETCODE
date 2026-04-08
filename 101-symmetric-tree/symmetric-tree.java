/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static boolean Solve(TreeNode L, TreeNode R)
    {
        if(L == null && R == null)  return true;
    
        if(L == null || R == null || L.val != R.val) return false;

        return Solve(L.left, R.right) && Solve(R.left, L.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
         if(root.left == null && root.right == null)
        {
            return true;
        }
        return Solve(root.left, root.right);
    }
}
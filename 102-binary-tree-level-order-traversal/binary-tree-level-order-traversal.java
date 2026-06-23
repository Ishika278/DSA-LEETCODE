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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        int height = getHeight(root);

        for (int i = 0; i < height; i++) {
            ans.add(solve(i, root));
        }
        return ans;
    }

    public int getHeight(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static List<Integer> solve(int level, TreeNode root) {
        List<Integer> temp = new ArrayList<>();
        if (root == null)
            return temp;

        if (level == 0) {
            temp.add(root.val);

        } else if (level > 0) {
            temp.addAll(solve(level - 1, root.left));
            temp.addAll(solve(level - 1, root.right));
        }
        return temp;
    }
}

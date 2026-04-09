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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        int LeftD = diameterOfBinaryTree(root.left);//diameter of left side
        int rightD = diameterOfBinaryTree(root.right);//diameter of right side

        int rootIncluded = Height(root.left) + Height(root.right);
        //int curr = height(root.left) + height(root.right);
        int ans = Math.max(LeftD, rightD);

        return Math.max(ans, rootIncluded);
    }
    public static int Height(TreeNode root)
    {
        if(root == null) return 0;

        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
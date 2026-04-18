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
     int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        Height(root);
        return diameter;
    }
    public int Height(TreeNode root)
    {
        // int diameter = 0;
        if(root == null) return 0;

        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);
        return Math.max(leftHeight, rightHeight)+ 1;
    }
}
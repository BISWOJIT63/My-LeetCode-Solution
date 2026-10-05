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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(height(root)== -1) return false;
        return true;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        int leftHeigt = height(root.left);
        int rightHeigt = height(root.right);
        if(leftHeigt == -1 || rightHeigt == -1) return -1;
        if(leftHeigt-rightHeigt > 1) return -1;
        if(Math.abs(leftHeigt-rightHeigt) > 1) return -1;
        return Math.max(rightHeigt,leftHeigt)+1;
    }
}
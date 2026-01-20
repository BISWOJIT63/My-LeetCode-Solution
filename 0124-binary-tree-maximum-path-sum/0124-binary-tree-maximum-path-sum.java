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
    int maxSum = Integer.MIN_VALUE;
    public int calcPathSum(TreeNode root){
        if(root == null ) return 0;
        int leftSum = Math.max(calcPathSum(root.left),0);
        int rightSum = Math.max(calcPathSum(root.right),0);
        maxSum = Math.max(leftSum+rightSum+root.val,maxSum);
        return Math.max(leftSum,rightSum)+root.val ;
    }

    public int maxPathSum(TreeNode root) {
        int val = calcPathSum(root);
        return Math.max(maxSum,val);
    }
}
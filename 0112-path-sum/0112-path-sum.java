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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return isExist(root,targetSum,0);       
    }
    public boolean isExist(TreeNode root, int targetSum,int curSum){
        if(root == null){
            return false;
        }
        curSum += root.val;
        if(root.left == null && root.right == null){
            return curSum == targetSum;
        }
        return isExist(root.left,targetSum,curSum)||isExist(root.right,targetSum,curSum);
    }
}
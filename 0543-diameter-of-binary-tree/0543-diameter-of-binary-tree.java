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
    static int diameter = 0;
    public int dfs(TreeNode root){
        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        diameter = Math.max(diameter,left+right);//clacluclate diameter of current node 
        return Math.max(left,right)+1;//height
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null) return 0;
        diameter =0;
        
        dfs(root);
        return diameter;
    }
    
}
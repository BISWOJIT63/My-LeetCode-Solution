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
    static List<Integer> ans = new ArrayList<>();
    public static void inorder(TreeNode root){
            if(root == null){
                return;
            }
            
            //left
            inorder(root.left);
            System.out.print(root.val+" ");
            ans.add(root.val);
            //right
            inorder(root.right);
        }
    public List<Integer> inorderTraversal(TreeNode root) {
        ans.clear();
        if(root == null) return new ArrayList<>();
        inorder(root);
        return ans;
    }
}
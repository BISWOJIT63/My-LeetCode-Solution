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
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null ) return ans;

        int level = height(root);

        for(int i = 1; i <= level ;i++){
            List<Integer> arr = new ArrayList<>();
            if(i%2 == 0) {
               levelOrderRL(root,i,arr);
            }else{
                levelOrderLR(root,i,arr);
            }
            ans.add(arr);
        }
        return ans;
    }
    public void levelOrderRL(TreeNode root,int l ,List<Integer> arr){
       if(root == null) return;
       if(l == 1){
         arr.add(root.val);
         return;
       }
       levelOrderRL(root.right,l-1,arr);
       levelOrderRL(root.left,l-1,arr);
    }
    public void levelOrderLR(TreeNode root,int l ,List<Integer> arr){
       if(root == null) return;
       if(l == 1){
         arr.add(root.val);
         return;
       }
       levelOrderLR(root.left,l-1,arr);
       levelOrderLR(root.right,l-1,arr);
    }
}
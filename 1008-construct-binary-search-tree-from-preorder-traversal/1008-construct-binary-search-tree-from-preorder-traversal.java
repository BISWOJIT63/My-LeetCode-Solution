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
    int i ;
    public TreeNode consturct(int[] preorder,int min,int max){
        if(preorder.length-1 < i || (min >= preorder[i] || max <= preorder[i])){
            return null;
        }
        int val = preorder[i++];
        TreeNode root = new TreeNode(val);
        root.left = consturct(preorder,min,root.val);
        root.right = consturct(preorder,root.val,max);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0) return null;
        i = 0;
        return consturct(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}
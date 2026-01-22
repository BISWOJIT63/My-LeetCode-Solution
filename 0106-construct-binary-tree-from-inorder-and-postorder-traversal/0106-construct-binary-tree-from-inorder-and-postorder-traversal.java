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
    int idx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(inorder[i],i);
        }
        return helper(inorder,0,n-1,map,postorder,0,n-1);
    }
    public TreeNode helper(int[] inorder,int in_st,int in_end,HashMap<Integer,Integer> map,int[] postorder,int post_st,int post_end ){
        if(in_st > in_end) return null;
        int nodeVal = postorder[post_end];
        TreeNode newNode = new TreeNode(nodeVal);
        int nodeIdx = map.get(nodeVal);
        int leftSize =  nodeIdx-in_st;

        newNode.left = helper(inorder,in_st,nodeIdx-1,map,postorder,post_st,post_st+leftSize-1);
        newNode.right = helper(inorder, nodeIdx+1,in_end,map,postorder,post_st+leftSize,post_end-1);
        return newNode;
    }
}
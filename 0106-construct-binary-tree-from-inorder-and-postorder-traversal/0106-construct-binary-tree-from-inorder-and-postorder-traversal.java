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
        idx = n-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(inorder[i],i);
        }
        return helper(postorder,0,n-1,map);
    }
    public TreeNode helper(int[] postorder,int st,int end,HashMap<Integer,Integer> map ){
        if(st > end) return null;
        int nodeVal = postorder[idx--];
        TreeNode newNode = new TreeNode(nodeVal);
        int nodeIdx = map.get(nodeVal);

        newNode.right = helper(postorder, nodeIdx+1,end,map);
        newNode.left = helper(postorder,st,nodeIdx-1,map);
        return newNode;
    }
}
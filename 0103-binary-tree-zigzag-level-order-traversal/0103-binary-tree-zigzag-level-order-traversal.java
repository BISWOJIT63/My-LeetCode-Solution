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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null ) return ans;
        levelOrder(root,ans);
        int i = 1;
        for(List<Integer> innerList : ans){
            if(i%2 == 0) Collections.reverse(innerList);
            i++;
        }
        return ans;
    }
    public void levelOrder(TreeNode root, List<List<Integer>> ans){
        if(root == null) return;
            List<Integer> l = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                TreeNode curNode = q.remove();
                if(curNode == null){
                    ans.add(l);
                    l = new ArrayList<>();
                    if(q.isEmpty()) break;
                    else q.add(null);
                }else{
                    l.add(curNode.val);
                    if(curNode.left != null)q.add(curNode.left);
                    if(curNode.right != null)q.add(curNode.right);
                }
            }
    }
}
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
     public void traversal(TreeNode root,List<List<Integer>> ans){
            //check the tree is empty or not
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null ) return ans;
        traversal(root,ans);
        return ans;
    }
}
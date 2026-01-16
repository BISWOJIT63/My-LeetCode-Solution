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
    public int maxLevelSum(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null ) return 0;
        traversal(root,ans);
        int lvl = 1;
        int max = ans.get(0);
        for(int i = 1; i < ans.size(); i++){
            if(ans.get(i) > max){
                lvl = i+1;
                max = ans.get(i);
            }
        }
        return lvl;
    }
    public void traversal(TreeNode root,List<Integer> ans){
            //check the tree is empty or not
            if(root == null) return;
            int l = 0;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                TreeNode curNode = q.remove();
                if(curNode == null){
                    ans.add(l);
                    l = 0;
                    if(q.isEmpty()) break;
                    else q.add(null);
                }else{
                    l += curNode.val ;
                    if(curNode.left != null)q.add(curNode.left);
                    if(curNode.right != null)q.add(curNode.right);
                }
            }
    }
}
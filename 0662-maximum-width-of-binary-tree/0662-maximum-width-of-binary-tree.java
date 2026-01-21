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
    class Pair{
        TreeNode node;
        long idx;
        Pair( TreeNode node,long idx){
           this.node = node;
           this.idx = idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        long maxWidth = 0;
        Deque<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            long n = q.size();
            long st = q.peek().idx;
            long en = q.getLast().idx;
            maxWidth = (int) Math.max(en-st+1,maxWidth);
            for(long i = 0; i < n; i++){
                Pair pairNode = q.remove();
                TreeNode curNode = pairNode.node;
                long curIdx = pairNode.idx;
                if(curNode.left != null){
                    q.add(new Pair(curNode.left,2*curIdx+1));
                }
                if(curNode.right != null){
                    q.add(new Pair(curNode.right,2*curIdx+2));
                } 
            }

        }
        return (int)maxWidth;
    }
}
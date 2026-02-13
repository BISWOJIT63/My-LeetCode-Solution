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
    
    public void inorder(TreeNode root,ArrayList<Integer> l){
        if(root == null) return;
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
    }
    public TreeNode balanceBST(TreeNode root) {
        if(root == null) return null;
        ArrayList<Integer> l = new ArrayList<>();

        inorder(root,l);
        //System.out.println(l.size()-1);
       return constructBst(l,0,l.size()-1);
    //    return null;
    }
    public TreeNode constructBst(ArrayList<Integer>l, int st, int end){
        if(st > end){
            return null;
        }
        int mid = (st+end)/2;
        TreeNode node = new TreeNode(l.get(mid));
        node.left = constructBst(l,st,mid-1);
        node.right = constructBst(l,mid+1,end);
        return node;
    }
}
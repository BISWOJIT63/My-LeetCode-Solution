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
    HashMap<Integer,TreeNode> map = new HashMap<>();
    Set<Integer> child = new HashSet<>();
    public TreeNode canMerge(List<TreeNode> trees) {
        
        for(TreeNode tree : trees){
            map.put(tree.val,tree);
        }
        for(TreeNode tree: trees){
            if(tree.left != null) child.add(tree.left.val);
            if(tree.right != null) child.add(tree.right.val);
        }
        TreeNode root = null;
        for(TreeNode tree : trees){
            if(!child.contains(tree.val)){
                if(root != null) return null;
                root= tree;
            }
        }
        if(root == null) return null;
        map.remove(root.val);
        if(!dfs(root,Long.MIN_VALUE,Long.MAX_VALUE)) return null;
        if(!map.isEmpty()) return null;
        return root;
    }
   public boolean dfs(TreeNode root,long min,long max) {
    if(root == null) return true;
    if( root.val <= min || root.val >= max) return false;
    if(root.left == null && root.right == null && map.containsKey(root.val)){
        TreeNode mergedTree = map.get(root.val);
            root.left = mergedTree.left;
            root.right = mergedTree.right;
            map.remove(root.val);
    }
    return dfs(root.left,min,root.val) && dfs(root.right,root.val,max);
   }
}
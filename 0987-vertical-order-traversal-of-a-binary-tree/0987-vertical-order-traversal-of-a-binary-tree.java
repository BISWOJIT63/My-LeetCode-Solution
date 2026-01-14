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
    static class Info{
        TreeNode Node;
        int row;
        int col;
        public Info(TreeNode Node, int r,int c){
            this.Node = Node;
            row =r;
            col = c;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Map<Integer, List<int[]>> map = new TreeMap<>();
        Queue<Info> q = new LinkedList<>();
        
        q.add(new Info(root,0,0));
        while(!q.isEmpty()){
            Info cur = q.remove();
            if(cur == null){
                if(q.isEmpty()) break;
            }else{
                map.computeIfAbsent(cur.col, k -> new ArrayList<>()).add(new int[]{cur.row, cur.Node.val});
                if(cur.Node.left != null){
                    q.add(new Info(cur.Node.left,cur.row + 1, cur.col - 1));
                }
                if(cur.Node.right != null){
                    q.add(new Info(cur.Node.right,cur.row + 1, cur.col + 1));
                }   
            }
        }
        for(List<int[]> list : map.values()){
            list.sort((a,b)->{
                if(a[0] == b[0]) return a[1]-b[1];
                return a[0]-b[0];
            });
            List<Integer> col = new ArrayList<>();
            for(int[] l : list){
                col.add(l[1]);
            }
            ans.add(col);
        }

        return ans;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    StringBuilder sb = new StringBuilder("");

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       StringBuilder sb = new StringBuilder();
       convertToString(root,sb);
       return sb.toString();
    }
    public void convertToString(TreeNode root,StringBuilder sb){
         if(root == null){
            sb.append("n").append(",");
        }else{
            sb.append(root.val).append(",");
            convertToString(root.left,sb);
            convertToString(root.right,sb);
        }
    }

    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<>();
        q.addAll(Arrays.asList(data.split(",")));
        return construct(q);
    } 
    public TreeNode construct(Queue<String> q){
        String str = q.poll();
        if(str.equals("n")){
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(str));
        root.left = construct(q);
        root.right = construct(q);
        return root;        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
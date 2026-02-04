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
            sb.append("n,");
        }else{
            sb.append(root.val);
            sb.append(",");
            convertToString(root.left,sb);
            convertToString(root.right,sb);
        }
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] str = data.split(",");
        return construct(str);
    }
    int i = 0;
    public TreeNode construct(String[] str){
        if(i >= str.length){
            return null;
        }
        String val = str[i++];
        if(val.equals("n")){
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = construct(str);
        root.right = construct(str);
        return root;        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
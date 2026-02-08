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
        //use string bulder because it is mutable and
        //traverse preorder add according to the preorder root -> left - > right
       StringBuilder sb = new StringBuilder();
       convertToString(root,sb);
       return sb.toString(); //return as string bcz return type string
    }
    //perform preorder and convert the tree as a string
    public void convertToString(TreeNode root,StringBuilder sb){
         if(root == null){
            sb.append("n,");
        }else{
            sb.append(root.val);                   //
            sb.append(",");                        //preoder traversal
            convertToString(root.left,sb);         //
            convertToString(root.right,sb);        //
        }
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        //then split the string to array by your using splitter(,) for easy traversal 
        //then call anaother function which take array and create the tree
        String[] str = data.split(",");
        return construct(str);
    }
    int i = 0; //indiacte the curent index
    public TreeNode construct(String[] str){
        if(i >= str.length){ //if the index out of bound or traverse all then return null 
            return null;
        }
        String val = str[i++];
        //when see n or null or not a number node then return null
        if(val.equals("n")){
            return null;
        }
        //convert the string val -> integer
        //and create the root according to preorder traversal
        TreeNode root = new TreeNode(Integer.parseInt(val)); 
        root.left = construct(str);//then call for left
        root.right = construct(str);//then call for right
        return root;        //after done return root
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
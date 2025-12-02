class Solution {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < paths.length; i++){
            String s = paths[i];
            if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if(s.equals(".")|| s.equals("")) {
                //do nothing
                continue;
            }
            else{
                stack.push(s);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(stack.size()>0){
           sb.insert(0,"/"+stack.pop());
        }
        
        return sb.length()==0 ?"/": sb.toString();
    }
}
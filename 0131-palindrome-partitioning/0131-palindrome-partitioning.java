class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        backtrack(s,temp,0,ans);
        return ans;
    }
    public static void backtrack(String s,List<String> temp, int x,List<List<String>>ans ){
        if(x == s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = x; i < s.length() ; i++){
            String sub = s.substring(x,i+1);
            if(isPalindrome(sub)){
                temp.add(sub);
                backtrack(s,temp,i+1,ans);
                temp.remove(temp.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String sub){
        int left = 0;
        int right = sub.length() - 1;

        while (left < right) {
            if (sub.charAt(left) != sub.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }
}
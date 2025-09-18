class Solution {
    public String removeOccurrences(String s, String part) {
        int m = part.length();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            sb.append(ch);
            if(sb.length() >= m && sb.substring(sb.length()-m).equals(part) ){
                sb.delete(sb.length()-m,sb.length());
            }
        }
        return sb.toString();        
    }
}
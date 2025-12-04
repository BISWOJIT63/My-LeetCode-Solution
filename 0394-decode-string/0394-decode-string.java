class Solution {
    private int i = 0; //which represent to the current index it helps to track the string

    public String decodeString(String s) {
        return solve(s);
    }
    public String solve(String s){
        StringBuilder sb = new StringBuilder();
        int num = 0;
        while( i < s.length()){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                i++;
                num = num*10+(ch-'0');
            }else if(Character.isLetter(ch)){
                i++;
                sb.append(ch);
            }else if(ch == '['){
                i++;
                String result = solve(s);
                while(num -- > 0){
                    sb.append(result);
                }
                num = 0;
            }else if(ch == ']'){
                i++;
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
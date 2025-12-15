class Solution {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
           str[i] =""+nums[i];
        }
        Arrays.sort(str,(a,b)->{
            String x =a+b; 
            String y =b+a;
            if (x.compareTo(y) > 0) return -1;
            if (x.compareTo(y) < 0) return 1;
            return 0;
        });
        
        String ans = "";
        for(String st : str){
            ans +=st;
        }
        if(ans.length() == 0 || ans.charAt(0) == '0') return "0";
        return ans;
    }
}
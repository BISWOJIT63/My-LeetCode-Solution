class Solution {
    public int[] sumZero(int n) {
        int ans[] = new int[n];
        if(n%2 != 0){
            ans[n/2] = 0;
            int inp = n/2;
            for(int i = 0; i < n/2; i++){
                ans[i] = -inp;
                ans[n-i-1] = inp;
                inp--;
            }
        }else{
            int inp = n/2;
            System.out.println(inp);
            for(int i = 0; i < n/2; i++){
                ans[i] = -inp;
                ans[n-i-1] = inp;
                inp--;
            }
        }
        
        return ans;
    }
}
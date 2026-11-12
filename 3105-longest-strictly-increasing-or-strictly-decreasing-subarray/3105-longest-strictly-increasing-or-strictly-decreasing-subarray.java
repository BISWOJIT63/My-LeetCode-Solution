class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        if(n == 1 ){
            return n;
        }
        int ans = 1;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j< n;j++){
                if(nums[i] < nums[j] && nums[j] > nums[j-1]){
                    ans=Math.max(ans,(j-i)+1);
                }else{
                  break;  
                }
                
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = i+1; j< n;j++){
                if(nums[i] > nums[j] && nums[j] < nums[j-1]){
                    ans=Math.max(ans,(j-i)+1);
                }else{
                    break;
                }
            }
        }
        return ans;
    }
}
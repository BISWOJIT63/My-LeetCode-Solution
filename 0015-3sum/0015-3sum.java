class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length-1 ; i++ ){
            if(i != 0 && nums[i] == nums[i-1]) continue;
            int k = i+1;
            int j = nums.length-1;
            
            while(k < j){
            List<Integer> curAns = new ArrayList<>();
            int sum = nums[i]+nums[j]+nums[k];
            if(sum > 0){
                  j--;
            }else if(sum < 0){
                k++;
            }else{
                curAns.add(nums[i]);
                curAns.add(nums[k]);
                curAns.add(nums[j]);
                j--;
                k++;
                while(k < j && nums[k] == nums[k-1] ){
                    k++;
                }
                while(k < j && nums[j] == nums[j+1]){
                    j--;
                }   
                ans.add(curAns);   
            } 
        }
     }   
    return ans;
    }
}
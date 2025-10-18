class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int p1 = 0; p1 < nums.length ; p1++){
            if( p1 > 0 && nums[p1] == nums[p1-1]) continue;
            for(int p2 = p1+1; p2 < nums.length ; p2++){
            if( p2 > p1+1 && nums[p2] == nums[p2-1]) continue;
            int p3 = p2+1;
            int p4 = nums.length-1;
            while(p3 < p4 ){
                long sum =(long) nums[p1]+nums[p2]+nums[p3]+nums[p4];
                if(sum < target){
                    p3++;
                }
                else if(sum > target){
                    p4--;
                }else{
                  
                   ans.add(Arrays.asList(nums[p1],nums[p2],nums[p3],nums[p4]));
                   p3++;
                   p4--;
                   while(p3 < p4 && nums[p3] == nums[p3-1])
                    p3++;
        
                   while(p3 < p4 && nums[p4] == nums[p4+1])
                    p4--;
                   
                   
                }
            }
        }
        }
        return ans;
    }
}
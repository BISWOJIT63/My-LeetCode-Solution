class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        if(n < 4){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length-3; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            //these 2 line are aditional line for run faster
            if((long)nums[i]+nums[i+1]+nums[i+2]+nums[i+3] > target) break;
            if((long) nums[i]+nums[n-1]+nums[n-2]+nums[n-3] < target) continue;

            for(int j = i+1; j< nums.length-2; j++){
                if(j > i+1 && nums[j] == nums[j-1]){
                continue;
            }
            if((long)nums[i]+nums[j]+nums[j+1]+nums[j+2] > target) break;
            if((long) nums[i]+nums[j]+nums[n-1]+nums[n-2] < target) continue;

            int k = j+1;
            int l = nums.length-1;
            while(k < l){
                long sum =(long) nums[i]+nums[j]+nums[k]+nums[l];
                if(sum == target){
                  ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                  while(k < l && nums[k] == nums[k+1]) k++;
                  while(k < l && nums[l] == nums[l-1]) l--;
                  k++;
                  l--;
                }else if(sum < target){
                    k++;
                }else{
                    l--;
                }
            }
            }
        }
        return ans;
    }
}
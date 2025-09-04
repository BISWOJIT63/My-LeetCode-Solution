class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums.length < 3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);

        List<List<Integer>> finalAns = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i+1;
            int k = nums.length-1;
            int curElement = -(nums[i]); 
            while(j < k){
                if(nums[j]+nums[k] == curElement){
                   finalAns.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k])));
                    j++;
                    k--;

                     while (j < k && nums[j] == nums[j - 1]) j++;

                    // Skip duplicates for k
                    while (j < k && nums[k] == nums[k + 1]) k--;
                    
                }else if(nums[j]+nums[k] > curElement){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return finalAns;
    }
}
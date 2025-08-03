class Solution {
    public void subset(int start,List<List<Integer>> ans,ArrayList<Integer> subArr , int[] nums,int n){
        ans.add(new ArrayList<>(subArr));
        for(int i = start; i < n; i++){
            if(i > start && nums[i] == nums [i-1]) continue;
            subArr.add(nums[i]);
            subset(i+1,ans,subArr,nums,n);
            subArr.remove(subArr.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if (n == 1) {
            ans.add(new ArrayList<>());                
            ans.add(Arrays.asList(nums[0]));           
            return ans;
        }
        ArrayList<Integer> subArr = new ArrayList<>();
        subset(0,ans,subArr,nums,n);
        return ans;
    }
}
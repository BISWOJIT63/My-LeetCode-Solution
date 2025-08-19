class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i =0; i < n; i++ ){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        ArrayList <Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue() > n/3){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
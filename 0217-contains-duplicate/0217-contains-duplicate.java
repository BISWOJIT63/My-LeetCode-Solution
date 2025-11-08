class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> m = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
             m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }
        for(Integer key : m.keySet()){
            if(m.get(key) >= 2){
                return true;
            }
            }
        return false;
    }
}
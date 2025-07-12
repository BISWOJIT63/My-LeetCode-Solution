class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int n : nums){
            prefixSum += n;
            int requiredSum = prefixSum - k;
            if(map.containsKey(requiredSum)){
                 count += map.get(requiredSum);
            }
                map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
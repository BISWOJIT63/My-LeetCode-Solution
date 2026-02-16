class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> hm = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            maxHeap.add(entry.getValue());
        }
        int i = 0;
        while (i < k) {
            ans[i++] = getKeyFromValue(hm, maxHeap.poll());
        }
        return ans;
    }

    public int getKeyFromValue(HashMap<Integer, Integer> hm, int value) {
        for (int key : hm.keySet()) {
            if (hm.get(key) == value) {
                hm.remove(key);
                return key;
            }
        }
        return -1; 
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
        maxHeap.addAll(hm.keySet());
        int i = 0;
        while (i < k) {
            ans[i++] = maxHeap.poll();
        }
        return ans;
    }
}
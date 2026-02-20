class Solution {
    public class MinHeap implements Comparable<MinHeap> {
        int val, row, col;

        public MinHeap(int val, int row, int col) {
            this.val = val;
            this.row = row;
            this.col = col;
        }

        @Override
        public int compareTo(MinHeap h) {
            return this.val - h.val;
        }
    }

    public PriorityQueue<MinHeap> pq = new PriorityQueue<>();

    public int[] smallestRange(List<List<Integer>> nums) {
        int min = 0;
        int max = Integer.MIN_VALUE;
        int k = nums.size();
        for (int i = 0; i < k; i++) {
            pq.offer(new MinHeap(nums.get(i).get(0), i, 0));
            max = Math.max(max, nums.get(i).get(0));
        }
        int st = 0;
        int end = Integer.MAX_VALUE;
        while (true) {
            MinHeap cur = pq.poll();
            min = cur.val;
            if (max - min < end - st) {
                st = min;
                end = max;
            }
            if (cur.col + 1 < nums.get(cur.row).size()) {
                int val = nums.get(cur.row).get(cur.col + 1);
                pq.offer(new MinHeap(val, cur.row, cur.col + 1));
                max = Math.max(max, val);
            } else {
                break;
            }
        }
        return new int[] { st, end };
    }
}
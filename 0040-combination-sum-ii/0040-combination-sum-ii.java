class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        List<Integer> l = new ArrayList<>();
        backtracking(arr, t, ans, l, 0);
        return ans;
    }

    public void backtracking(int[] arr, int t, List<List<Integer>> ans, List<Integer> l, int cur) {
        if (t == 0) {
               ans.add(new ArrayList<>(l));
            return;
        }
        if (t < 0) {
            return;
        }
        for (int i = cur; i < arr.length; i++) {
            if(i > cur && arr[i] == arr[i-1]) continue;
            if(arr[i] > t) break;
            l.add(arr[i]);            
            backtracking(arr, t - arr[i], ans, l, i+1);
            l.remove(l.size() - 1);
        }
    }
    public boolean isExist(List<List<Integer>> ans, List<Integer> l){
        return ans.contains(l);
    }
}
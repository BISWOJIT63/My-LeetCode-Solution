class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        backtracking(arr,t,ans,l,0);
        return ans;
    }
    public void backtracking(int[] arr,int t,List<List<Integer>> ans ,List<Integer> l,int cur){
        if(t == 0){
            ans.add(new ArrayList<>(l));
        }
        if(t < 0){
            return;
        }
        for(int i = cur; i < arr.length;i++){
            l.add(arr[i]);
            backtracking(arr,t-arr[i],ans,l,i);
            l.remove(l.size()-1);
        }
    }
}
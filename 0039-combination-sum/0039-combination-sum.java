class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        findAns(candidates,target,ans,l,0);
        return ans;
    }
    public static void findAns(int[] arr, int tar,List<List<Integer>> ans ,List<Integer> l,int start){
        if(tar == 0){
            ans.add(new ArrayList<>(l));
            return;
        }
        if(tar < 0){
            return;
        }
        for(int i = start; i < arr.length; i++){
            l.add(arr[i]);
            findAns(arr,tar-arr[i],ans,l,i);
            l.remove(l.size()-1);
        }
    }
}
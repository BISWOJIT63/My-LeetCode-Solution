class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(candidates);

        findAns(candidates,target,ans,l,0);
        return ans;
    }
    public static void findAns(int[] arr, int tar,List<List<Integer>> ans ,List<Integer> l,int start){
        if(tar == 0){
            if(!isExist(ans,l)){
                ans.add(new ArrayList<>(l));

            }
            return;
        }
        if(tar < 0){
            return;
        }
        for(int i = start; i < arr.length; i++){
            if(i > start && arr[i] == arr[i-1]) continue;
            if(tar < arr[i]) break;
            l.add(arr[i]);
            findAns(arr,tar-arr[i],ans,l,i+1);
            l.remove(l.size()-1);
        }
    }
    public static boolean isExist(List<List<Integer>> ans ,List<Integer> l){
        return (ans.contains(l));
    }
}
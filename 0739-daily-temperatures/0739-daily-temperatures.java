class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++){
            if(s.isEmpty()){
                s.push(i);
                continue;
            }
            while(!s.isEmpty() && temp[s.peek()] < temp[i]){
                ans[s.peek()] = i - s.pop();
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            ans[s.pop()] = 0;
        }
        return ans;
    }
}
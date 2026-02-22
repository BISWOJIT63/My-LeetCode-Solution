class Solution {
    public int binaryGap(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(n > 0){
            int rem = n % 2;
            arr.add(0, rem);
            n = n/2;
        }
        int max = 0;
        for(int i = 0; i < arr.size()-1; i++){
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(i) == 1 && arr.get(j) == 1){
                    max = Math.max(max,(j-i));
                    break;
                }else if(arr.get(i) != 1){
                    break;
                }
            }
        }
        return max;
    }
}
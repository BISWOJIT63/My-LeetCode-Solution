class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            m.put(nums1[i],m.getOrDefault(nums1[i],0)+1);
        }
        Arrays.sort(nums2);
        for(int i = 0; i < nums2.length; i++){
            if(i > 0 && nums2[i] == nums2[i-1]) continue;
            if(m.containsKey(nums2[i])){
                 ans.add(nums2[i]);
                m.put(nums2[i], m.get(nums2[i]) - 1);

                if(m.get(nums2[i]) == 0){
                    m.remove(nums2[i]);
                }
             }
        }
        int[] arr = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
         arr[i] = ans.get(i);
        }
        return arr;
    }
}
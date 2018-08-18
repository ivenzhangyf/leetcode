class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> interset = new HashSet<>();
        for(int n:nums1){
            if(!set.contains(n))
                set.add(n);
        }
        for(int n:nums2){
            if(set.contains(n))
                interset.add(n);
        }
        int[] res = new int[interset.size()];
        int i = 0;
        for(Integer n:interset){
            res[i] = n;
            i++;
        }
        return res;
    }
}
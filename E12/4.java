class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=0;
        int n2=0;
        int i=0;
        double mid=0;
        int len1=nums1.length;
        int len2=nums2.length;
        ArrayList<Integer> res = new ArrayList<>();
        while(n1<len1 && n2<len2){
            if (nums1[n1]<nums2[n2]){
                res.add(nums1[n1]);
                n1++;
            }else if(nums1[n1]>=nums2[n2]){
                res.add(nums2[n2]);
                n2++;
            }
        }
        while(n1<len1){
            res.add(nums1[n1]);
            n1++;
        }
        while(n2<len2){
            res.add(nums2[n2]);
            n2++;
        }
        res.trimToSize();
        i=res.size();    
         
        if (i % 2 == 1){
            mid = (double)res.get(i/2);
        }else{
            int i1=res.get(i/2);
            int i2=res.get(i/2-1);
            mid = (i1+i2)/2.0;
        }
        return mid;
    }
}
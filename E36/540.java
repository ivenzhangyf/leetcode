class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            if (i%2==0){
                if(i==nums.length-1)
                    return nums[i];
                res+=nums[i];
            }else{
                
                res-=nums[i];
            }
            if(res<0)
                return nums[i-1];
        }
        return 0;
    }
}
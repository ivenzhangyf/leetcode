class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i++) 
            if (nums[i] == 0 && nums[i + 1] == 0) return true;
        if (k == 0 || nums.length < 2)
            return false;
        if (k<0)k = -k;
        
        for (int i = 0;i < nums.length-1;i++){
            int j = i;
            int count = 0;
            int sum = 0;
            while(j<nums.length){
                sum+=nums[j];
                count++;
                j++;
                if (sum % k == 0&&count > 1)
                    return true;
            }
        }
        return false;
    }
}
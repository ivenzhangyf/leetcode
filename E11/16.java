class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int dif = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0;i < nums.length-2;i++){
            int left = i + 1;
            int right = nums.length-1;
            int t = target-nums[i];
            while (left < right){
                int difference = Math.abs(t-nums[left]-nums[right]);
                if (difference < dif){
                    dif = difference;
                    res = nums[i]+nums[left]+nums[right];
                }
                if (nums[left] + nums[right] == t){
                    return nums[i]+nums[left]+nums[right];
                }else if(nums[left] + nums[right] > t){
                    right--;
                }else if(nums[left] + nums[right] < t){
                    left++;
                }
            }
        }
        return res;
    }
}
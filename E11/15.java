class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            int j = i+1;
            int k = nums.length-1;
            int t = -nums[i];
            while(j<k){
                if (nums[j]+nums[k] == t){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                        continue;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                        continue;
                    }
                }else if(nums[j]+nums[k] > t){
                    k--;
                }else{
                    j++;
                }     
            }
        }
        return res;
    }
}
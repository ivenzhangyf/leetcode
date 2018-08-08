class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int[] num = new int[nums.length];
        for (int n:nums){
            num[n-1]++;
        }
        for(int i = 0;i<num.length;i++){
            if(num[i]==0)
                res.add(i+1);
        }
        return res;
    }
}
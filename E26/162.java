class Solution {
    public int findPeakElement(int[] nums) {
        int[] newNums = new int[nums.length+2];
        newNums[newNums.length-1]=newNums[0] = Integer.MIN_VALUE;
        for(int i =1;i<newNums.length-1;i++){
            newNums[i]=nums[i-1];
        }
        for(int i = 1;i<newNums.length-1;i++){
            if(newNums[i]>newNums[i-1]&&newNums[i]>newNums[i+1])
                return i-1;
        }
        return 0;
    }
}
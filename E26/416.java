class Solution {
    public boolean canPartition(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int num : nums) sum += num;
        if ((sum & 1) == 1) return false;
        int target = sum/2;
        boolean[][] dp = new boolean[len+1][sum+1];
        dp[0][0]=true;
        for (int i =1;i<=len;i++)
            dp[i][0]=true;
        for (int i =1;i<=sum;i++)
            dp[0][i]=false;
        
        for(int i =1;i<=len;i++){
            for (int j = 1;j<=sum;j++){
                dp[i][j]=dp[i-1][j];
                if (j>=nums[i-1])dp[i][j]=dp[i][j]||dp[i-1][j-nums[i-1]];
            }
        }
        return dp[len][target];
    }
}
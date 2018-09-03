class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;
        int[][] dp = new int[3][prices.length];
        for(int k = 1;k<=2;k++){
            for(int i = 1;i<prices.length;i++){
                int min = prices[0];
                for(int j = 1;j<i;j++){
                    min = Math.min(min,prices[j]-dp[k-1][j-1]);
                }
                dp[k][i]=Math.max(dp[k][i-1],prices[i]-min);
            }
        }
        return dp[2][prices.length-1];
    }
}
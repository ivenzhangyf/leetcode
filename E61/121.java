class Solution {
    public int maxProfit(int[] prices) {
        int res = Integer.MIN_VALUE;
        
        for(int i = 0;i<prices.length-1;i++){
            for(int j = i+1;j<prices.length;j++){
                res = Math.max(res,prices[j]-prices[i]);
            }
        }
        return res>=0?res:0;
    }
}
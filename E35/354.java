class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return a[0]==b[0]?b[1]-a[1]:a[0]-b[0];
            }
        });
        int n = envelopes.length;
        int[] dp = new int[n];
        int res = 0;
        for(int i = 0;i < n;i++){
            dp[i]=1;
            for(int j = 0;j < i;j++){
                if(envelopes[i][0]>envelopes[j][0]&&envelopes[i][1]>envelopes[j][1])
                    dp[i]=Math.max(dp[i],dp[j]+1);
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
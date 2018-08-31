class Solution {
    public int countPalindromicSubsequences(String S) {
        int  M = 1000000007;
        int len = S.length();
        int[][] dp = new int[len][len];
        for(int i = 0;i<len;i++){
            dp[i][i]=1;
        }
        for(int t = 1;t<len;t++){
            for(int i = 0;i<len-t;i++){
                int j = i+t;
                if(S.charAt(i)!=S.charAt(j)){
                    dp[i][j]=dp[i+1][j]+dp[i][j-1]-dp[i+1][j-1];
                }else{
                    dp[i][j]=dp[i+1][j-1]*2;
                    int l = i+1;
                    int r = j-1;
                    while(l<=r&&S.charAt(l)!=S.charAt(i)) l++;
                    while(l<=r&&S.charAt(r)!=S.charAt(i)) r--;
                    if(l==r){
                        dp[i][j]+=1;
                    }else if(l<r){
                        dp[i][j]-=dp[l+1][r-1];
                    }else{
                        dp[i][j]+=2;
                    }
                }
                dp[i][j] = dp[i][j] < 0 ? dp[i][j] + 1000000007 : dp[i][j] % 1000000007;
            }
        }
        return dp[0][len-1];
    }
}
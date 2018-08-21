class Solution {
    public int numFriendRequests(int[] ages) {
        int[] numInAge = new int[121];
        int[] sumInAge = new int[121];
        int res = 0;
        for(int n:ages){
            numInAge[n]++;
        }
        for(int i = 1;i<121;i++)
            sumInAge[i] = sumInAge[i-1]+numInAge[i];
        
        for(int i = 15;i<121;i++){
            int count =sumInAge[i]-sumInAge[i/2+7];
            res+=(count-1)*numInAge[i];
        }
        return res;
    }
}
class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int currentStair = 0;
        int oneStairBefore = 2;
        int twoStairBefore = 1;
        int i = 2;
        while (i < n){
            currentStair = oneStairBefore + twoStairBefore;
            twoStairBefore = oneStairBefore;
            oneStairBefore = currentStair;
            i++;
             
        }
        return currentStair;
    }
}
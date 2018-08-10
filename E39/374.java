public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int lo = 1;
        int hi = n;
        int mid = 0;
        while(lo<hi){
            mid = lo+(hi-lo)/2;
            if(guess(mid)==-1){
                hi = mid;
            }else if(guess(mid)==1){
                lo = mid + 1;
            }else if(guess(mid)==0){
                return mid;
            }
        }
        return lo;
    }
}
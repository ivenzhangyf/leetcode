class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 0||(dividend  == Integer.MIN_VALUE&&divisor == -1))return Integer.MAX_VALUE;
        int res = 0;
        long m = Math.abs((long)dividend);
        long n = Math.abs((long)divisor);
        int sign = ((dividend<0)^(divisor<0))?-1:1;
        if(n==1)
            return sign>0?(int)m:-(int)m;
        while(m>=n){
            long t = n,count = 1;
            while(m>=(t<<1)){
                t<<=1;
                count<<=1;
            }
            m-=t;
            res+=count;
        }
        System.out.print(m);
        return sign>0?res:-res;
    }
}
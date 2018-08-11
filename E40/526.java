class Solution {
    int count = 0;
    
    public int countArrangement(int N) {
        countHelp(1,N,new int[N+1]);
        return count;
    }
    
    private void countHelp(int pos,int n,int[] used){
        if(pos>n){
            count++;
            return;
        }
        for(int i = 1;i <= n;i++){
            if(used[i]==0 && (pos % i == 0||i % pos == 0)){
                used[i]=1;
                countHelp(pos+1,n,used);
                used[i]=0;
            }
        }
        return;
    }
}
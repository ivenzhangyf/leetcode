class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] table = new int[26];
        for(int i = 0;i< tasks.length;i++){
            table[tasks[i]-'A']++;
        }
        Arrays.sort(table);
        int max = table[25];
        int i = 25;
        while(max==table[i]){
            i--;
        }
        int extra = 25-i;
        int maxlen = (n+1)*(max-1)+extra;
        int result = Math.max(tasks.length,maxlen);
        return result;
    }
}
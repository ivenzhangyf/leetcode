class Solution {
    public int countBinarySubstrings(String s) {
        int pre = 0;
        int current = 1;
        int count = 0;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                current++;
            }else{
                pre = current;
                current = 1;
            }
            if(pre>=current)
                count++;
        }
        return count;
    }
}
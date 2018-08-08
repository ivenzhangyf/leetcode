class Solution {
    public char findTheDifference(String s, String t) {
        int[] aph = new int[26];
        for(char c:s.toCharArray()){
            aph[c-'a']++;
        }
        for(char c:t.toCharArray()){
            aph[c-'a']--;
            if(aph[c-'a']<0)
                return c;
        }
        return '0';
    }
}
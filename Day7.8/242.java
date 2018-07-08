class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())return false;
        int[] table = new int[26];
        for (int i=0;i<s.length();i++){
            table[s.charAt(i)-'a']++;
        }
        for (int j=0;j<t.length();j++){
            table[t.charAt(j)-'a']--;
        }
        for (int k=0;k<26;k++){
            if (table[k]!=0)
                return false;
        }
        return true;
    }
}
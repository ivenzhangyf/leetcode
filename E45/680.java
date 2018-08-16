class Solution {
    public boolean validPalindrome(String s) {
        int l = -1;
        int r = s.length();
        while(++l<--r){
            if(s.charAt(l)!=s.charAt(r))
                return isPalindrome(s,l,r+1)||isPalindrome(s,l-1,r);
        }
        return true;
    }
    public boolean isPalindrome(String s,int l,int r){

        while(++l<--r){
            if(s.charAt(l)!=s.charAt(r))
                return false;   
        }
        return true;
    }
}
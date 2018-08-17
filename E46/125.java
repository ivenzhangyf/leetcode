class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(!((l>='a'&&l<='z')   ||   (l>='A'&&l<='Z')  ||  (l>='0'&&l<='9'))){
                left++;
                continue;
            }
            if(!((r>='a'&&r<='z')   ||   (r>='A'&&r<='Z')  ||  (r>='0'&&r<='9'))){
                right--;
                continue;
            }
            if(!String.valueOf(l).equalsIgnoreCase(String.valueOf(r))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
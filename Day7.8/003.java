class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue res = new LinkedList();
        int len = s.length();
        int max = 0;
        for(int i = 0;i < len;i++){
            while(res.contains(s.charAt(i))){
                    res.poll();
            }
            if (!res.contains(s.charAt(i)))
                res.add(s.charAt(i));
            int len2 = res.size();
            if (len2 > max)
                max = len2;der
        }
        return max;
             
        
    }
}
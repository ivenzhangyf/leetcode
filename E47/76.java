class Solution {
    public String minWindow(String s, String t) {
        int[] map = new int[256];
        int start = 0 , end = 0,d = Integer.MAX_VALUE,head = 0;
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        for(char c:tchar){
            map[c]++;
        }
        int count = tchar.length;
        while(end<schar.length){
            if(map[schar[end]]>0){
                count--;
            }
            map[schar[end]]--;
            while(count==0){
                if((end-start+1) < d){
                    head = start;
                    d = end-start+1;
                }
                map[schar[start]]++;
                if(map[schar[start]]>0)
                    count++;
                start++;
                
            }
            end++;
        }
        return d+head>schar.length?"":s.substring(head,head+d);
    }
}
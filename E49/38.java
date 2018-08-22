class Solution {
    public String countAndSay(int n) {
        StringBuffer sb = new StringBuffer("1");
        StringBuffer str;
        int count;
        char cur;
        for(int i = 1;i<n;i++){
            str = sb;
            sb = new StringBuffer();
            count = 1;
            
            cur = str.charAt(0);
            for(int j = 1;j<str.length();j++){
                if(str.charAt(j)!=cur){
                    sb.append(count).append(cur);
                    count = 1;
                    cur = str.charAt(j);
                }else{
                    count++;
                }
            }
            sb.append(count).append(cur);
            
        }
        return sb.toString();
    }
}
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] visited = new boolean[26];
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        for(char c:s.toCharArray()){
            count[c-'a']--;
            if (visited[c-'a'])
                continue;
            while(!st.isEmpty()&&st.peek()>c&&count[st.peek()-'a']>0){
                visited[st.pop()-'a']=false;
            }
            st.push(c);
            visited[c-'a']=true;            
        }
        StringBuilder res = new StringBuilder();
        for(char c:st){
            res.append(c);
        }
        return res.toString();
    }
}
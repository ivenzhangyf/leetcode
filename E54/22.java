class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backTrack(list,0,0,n,"");
        return list;
    }
    public void backTrack(List<String> list,int open,int close,int max,String str){
        if(str.length()==max*2){
            list.add(str);
            return;
        }
        if(open<max)
            backTrack(list,open+1,close,max,str+"(");
        if(close<open)
            backTrack(list,open,close+1,max,str+")");
        
    }
}
class Solution {
    public List<String> letterCombinations(String digits) {
        
        String source[][]={{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
        LinkedList<String> res = new LinkedList<>();
        if (digits.isEmpty())
            return res;
        res.add("");
        int len = digits.length();
        char[] digit = digits.toCharArray();
        int[] num = new int[7];
        for(int i = 0;i< len;i++){
            num[i]=digit[i]-'0'-2;
        }
        
        for (int i = 0;i<digits.length();i++){
            while(res.peek().length()==i){
                String t = res.remove();
                for(String s:source[num[i]]){
                    res.add(t+s);
                }
            }
        }
        
        return res;
    }
}
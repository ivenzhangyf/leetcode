class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        int pre = 0;
        for(String str:logs){
            String[] s = str.split(":");
            if(!stack.isEmpty()){
                res[stack.peek()]+=Integer.parseInt(s[2])-pre;
            }
            pre = Integer.parseInt(s[2]);
            if(s[1].equals("starts")){
                stack.push(Integer.parseInt(s[0]));
            }else{
                res[stack.pop()]++;
                pre++;
            }
        }
        return res;
        
    }
}
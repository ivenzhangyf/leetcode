class Solution {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length()-1;
        int l2 = num2.length()-1;
        int val = 0;
        int sum = 0;
        int c = 0;
        StringBuilder sb = new StringBuilder();
        while(l1>=0||l2>=0||c==1){
            sum = (l1>=0?num1.charAt(l1)-'0':0)+(l2>=0?num2.charAt(l2)-'0':0)+c;
            val = sum%10;
            c = sum/10;
            sb.append(val);
            l1--;
            l2--;
        }
        return sb.reverse().toString();
    }
}
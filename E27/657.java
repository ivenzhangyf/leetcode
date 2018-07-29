class Solution {
    public boolean judgeCircle(String moves) {
        int u = 0;
        int d = 0;
        int l = 0;
        int r = 0;
        char[] move = moves.toCharArray();
        for(char c:move){
            switch (c){
                case 'U':
                    u++;
                    break;
                case 'D':
                    d++;
                    break;
                case 'L':
                    l++;
                    break;
                case 'R':
                    r++;
                    break;
            }
        }
        if (u==d&&l==r)return true;
        return false;
    }
}
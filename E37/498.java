class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[0];
        int x = 0,y = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] res = new int[m*n];
        for (int i = 0;i < res.length;i++){
            res[i]=matrix[x][y];
            if((x+y)%2==0){
                if(y==n-1){
                    x++;
                }else if(x==0){
                    y++;
                }else{
                    x--;
                    y++;
                }
            }else{
                if(x==m-1){
                    y++;
                }else if(y==0){
                    x++;
                }
                else{
                    x++;
                    y--;
                }
            }
        }
        return res;
    }
}
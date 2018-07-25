class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] min = new int[m][n];
        for (int i = m-1;i>=0;i--){
            for (int j = n-1;j>=0;j--){
                if (i==m-1 && j==n-1){
                    min[i][j]=Math.max(1,1-dungeon[i][j]);
                }else if (i == m-1){
                    min[i][j] = Math.max(1, min[i][j+1] - dungeon[i][j]);
                } else if (j == n-1){
                    min[i][j] = Math.max(1, min[i+1][j] - dungeon[i][j]);
                }else{
                    min[i][j] = Math.max(1, Math.min(min[i+1][j],min[i][j+1]) - dungeon[i][j]);
                }  
            }
        }
        return min[0][0];
    }
}
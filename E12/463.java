class Solution {
    public int islandPerimeter(int[][] grid) {
        int num = 0;
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if (grid[i][j]==1){
                    num++;
                if (i<grid.length-1&&grid[i+1][j]==1)
                    count++;
                if (j<grid[0].length-1&&grid[i][j+1]==1)
                    count++;
                }
            }
        }
     
        return 4*num-2*count;
    }
}
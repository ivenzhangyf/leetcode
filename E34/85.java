class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0)return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] height = new int[n];
        int maxArea = 0;
        for (int i =0;i<n;i++){
            left[i]=0;
            right[i]=n;
            height[i]=0;
        }
        for (int i = 0;i < m;i++){
            int left_cur = 0;
            int right_cur = n;
            for(int j = 0;j < n;j++){
                if (matrix[i][j]=='1')
                    height[j]++;
                else
                    height[j]=0;
            }
            for(int j = 0;j < n;j++){
                if (matrix[i][j]=='1')
                    left[j] = Math.max(left_cur,left[j]);
                else{
                    left[j]=0;
                    left_cur=j+1;
                }
            }
            for(int j = n-1;j >=0;j--){
                if (matrix[i][j]=='1')
                    right[j] = Math.min(right_cur,right[j]);
                else{
                    right[j]=n;
                    right_cur = j;
                }
            }
            for(int j = 0;j < n;j++){
                maxArea = Math.max(maxArea,(right[j]-left[j])*height[j]);
            }
        }
        return maxArea;
    }
}
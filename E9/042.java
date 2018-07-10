class Solution {
    public int trap(int[] height) {
        int sum = 0;
        for(int i =1;i<height.length-1;i++){
            int maxleft = 0;
            int maxright = 0;
            for (int j=i;j>=0;j--){
                maxleft = Math.max(maxleft,height[j]);
            }
            for (int j=i;j<height.length;j++){
                maxright = Math.max(maxright,height[j]);
            }
            sum+=Math.min(maxleft,maxright)-height[i];
        }
        return sum;
    }
}
class Solution {
    public int trap(int[] height) {
      int max_left = 0;
        int max_right = 0;
        int i = 0;
        int j = height.length - 1;
        
        int ans = 0;
        
        while(i < j){
            if(height[i] < height[j]){
                if(height[i] < max_left)
                    ans+= max_left - height[i];
                else
                    max_left = height[i];
                i++;
            }
            else{
                if(height[j] < max_right)
                    ans+= max_right - height[j];
                else
                    max_right = height[j];
                j--;
            }
        }
        return ans;
    }
}
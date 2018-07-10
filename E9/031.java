class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length < 2) return ;
        if (nums.length==2) {
            swap(0,1,nums);
            return;
        }
        int index = nums.length-2;
        int index2 = nums.length-1;
        while(index>=0&&nums[index]>=nums[index+1]){
            index--;
        }
        if(index == -1){
            Arrays.sort(nums);
            return;
        }
        while(index>=0&&nums[index]>=nums[index2]){
            index2--;
        }
        swap(index,index2,nums);
        int l = index+1;
        int r = nums.length-1;
        while(l<r) {
            swap(l,r,nums);
            l++;
            r--;
        }
    }
    
    public void swap(int x,int y,int[] arr){
        int tmp=arr[x];
        arr[x]=arr[y];
        arr[y]=tmp;
    }
        
}
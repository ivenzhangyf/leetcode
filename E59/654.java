class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        return help(0,nums.length-1,nums);
       
    }
    public TreeNode help(int i,int j,int[] nums){
        if(i>j)
            return null;
       
        int p = i;//p为子串最大值下标
        for(int t = i;t<=j;t++){
            if(nums[p]<nums[t]){
                
                p = t;
            }
        }
        TreeNode node = new TreeNode(nums[p]);
        node.left = help(i,p-1,nums);
        node.right = help(p+1,j,nums);
        // ；‘’
    }
}
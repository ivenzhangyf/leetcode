/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int maxValue;
    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        findMax(root);
        return maxValue;
    }
    public int findMax(TreeNode root){
        if (root == null)return 0;
        int left = Math.max(0,findMax(root.left));
        int right = Math.max(0,findMax(root.right));
        maxValue = Math.max(maxValue,left+right+root.val);
        return Math.max(left,right) + root.val;
    }
}
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelp(inorder,0,inorder.length-1,preorder,0);
    }
    public TreeNode buildTreeHelp(int[] inorder,int inStart,int inEnd,int[] preorder,int preStart){
        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        TreeNode res = new TreeNode(preorder[preStart]);
        int rIndex = 0;
        for(int i = inStart;i<=inEnd;i++){
            if (inorder[i]==preorder[preStart]){
                rIndex = i;
                break;                
            }
        }
        res.left = buildTreeHelp(inorder,inStart,rIndex-1,preorder,preStart+1);
        res.right = buildTreeHelp(inorder,rIndex+1,inEnd,preorder,preStart+rIndex-inStart+1);   
        return res;
    }
}
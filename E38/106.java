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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelp(inorder,inorder.length-1,0,postorder,postorder.length-1);
    }
    public TreeNode buildTreeHelp(int[] inorder,int instart,int inend,int[] postorder,int poststart){
        if(instart<inend||poststart<0)
            return null;
        TreeNode res = new TreeNode(postorder[poststart]);
        int rIndex = instart;
        for(int i = instart;i>=inend;i--){
            if(inorder[i]==postorder[poststart]){
                rIndex = i;
                break;
            }
        }
        res.right = buildTreeHelp(inorder,instart,rIndex+1,postorder,poststart-1);
        res.left=buildTreeHelp(inorder,rIndex-1,inend,postorder,poststart-(instart-rIndex)-1);
        return res;
    }
}
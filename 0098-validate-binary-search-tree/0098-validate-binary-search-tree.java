/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return traverse(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean traverse(TreeNode root,long minv,long maxv)
    {
        if(root==null)return true;
        if(root.val<=minv || root.val>=maxv)return false;
        return (traverse(root.left,minv,root.val)&&traverse(root.right,root.val,maxv));
    }
}
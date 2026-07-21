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
    int c=0;
    public int countDominantNodes(TreeNode root) {
        traverse(root);
        return c;

    }
    public int traverse(TreeNode root){
        if(root==null)return Integer.MIN_VALUE;
        int leftmax=traverse(root.left);
        int rightmax=traverse(root.right);
        int curmax=Math.max(root.val,Math.max(leftmax,rightmax));
        if(root.val==curmax)c++;
        return curmax;
    }
}
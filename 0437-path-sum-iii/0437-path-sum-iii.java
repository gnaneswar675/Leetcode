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
            int res=0;

    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)return 0;
        traverse(root,targetSum);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return res;
    }
    public void traverse(TreeNode root,long target){
        if(root==null)return;
        target-=root.val;
        if(target==0)res++;
        traverse(root.left,target);
        traverse(root.right,target);
    }
}
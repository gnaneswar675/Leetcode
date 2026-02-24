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
    public int pathSum(TreeNode root, int target) {
        if(root==null){
            return 0;
        }
        helper(root,target,0);
        pathSum(root.left,target);
        pathSum(root.right,target);

        return res;
    }
    public void helper(TreeNode root,int target,long cursum){
        if(root==null)return;

        cursum+=root.val;
        if(target==cursum){
            res++;
        }
        helper(root.left,target,cursum);
        helper(root.right,target,cursum);
    }
}
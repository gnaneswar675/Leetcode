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
    public int sumNumbers(TreeNode root) {
        int num=0;
        traverse(root,num);
        return res;
    }
    public void traverse(TreeNode root,int num){
        if(root==null)return;

        num=num*10+root.val;
        if(root.right==null && root.left==null){
            res+=num;
        }
        traverse(root.left,num);
        traverse(root.right,num);
    }
}
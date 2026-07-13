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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;
        if(root.val==key)return helperrr(root);
        TreeNode demo=root;
        while(root!=null){
            if(key<root.val){
                if(root.left!=null && key==root.left.val){
                    root.left=helperrr(root.left);
                    break;
                }
                else
                    root=root.left;
            }
            else{
                if(root.right!=null && key==root.right.val){
                    root.right=helperrr(root.right);
                    break;
                }
                else
                    root=root.right;
                
            }
        }
        return demo;
    }
    public TreeNode helperrr(TreeNode root){
        if(root.right==null)
            return root.left;
        if(root.left==null)
            return root.right;
    
            TreeNode rightchild=root.right;
            TreeNode leftright=finderrr(root.left);
            leftright.right=rightchild;
            return root.left;
    }
    TreeNode finderrr(TreeNode root){
        if(root.right==null)return root;
        return finderrr(root.right);
    }
}
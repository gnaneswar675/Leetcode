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
        if(root.val==key){
            return helper(root);
        }
        TreeNode demo=root;
        while(root!=null)
        {
            if(key<root.val){
                if(root.left!=null && key==root.left.val){
                    root.left=helper(root.left);
                }else{
                    root=root.left;
                }
            }else{
                if(root.right!=null && key==root.right.val){
                    root.right=helper(root.right);
                }else{
                    root=root.right;
                }
            }
        }return demo;
    }
    public TreeNode helper(TreeNode root){
        if(root.right==null){
            return root.left;
        }
        else if(root.left==null){
            return root.right;
        }
        else{
            TreeNode rightchild=root.right;
            TreeNode lastright=find(root.left);
            lastright.right=rightchild;
            return root.left;
        }

    }
    public TreeNode find(TreeNode root){
        if(root.right==null){
            return root;
        }
        return find(root.right);
    }

}
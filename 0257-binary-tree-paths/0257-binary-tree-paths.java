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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>res=new ArrayList<>();
        traverse(root,"",res);
        return res;
    }
    public void traverse(TreeNode root,String str,List<String> res){
        if(root==null)return;
        str=str+root.val;
        if(root.left==null && root.right==null){
            res.add(str);
        }
        traverse(root.left,str+"->",res);
        traverse(root.right,str+"->",res);
    }
}
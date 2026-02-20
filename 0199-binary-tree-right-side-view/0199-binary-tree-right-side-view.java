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
    public List<Integer> rightSideView(TreeNode root) {        
        List<Integer> res=new ArrayList<>();
        traverse(root,0,res);
        return res;      

    }
    public void traverse(TreeNode root,int level,List<Integer> res)
    {
        if (root==null)return;
        if(level==res.size())res.add(root.val);
        traverse(root.right,level+1,res);
        traverse(root.left,level+1,res);
    }
}
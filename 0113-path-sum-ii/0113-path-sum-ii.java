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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>res=new ArrayList<>();
        if(root==null)return res;
        List<Integer>cur=new ArrayList<>();
        traverse(root,0,targetSum,res,cur);
        return res;
    }
    public void traverse(TreeNode root,int cursum,int targetSum,List<List<Integer>> res,List<Integer> cur){
        if(root==null)return;
        cursum+=root.val;
        cur.add(root.val);
        if(root.left==null && root.right==null && targetSum==cursum){
            res.add(new ArrayList<>(cur));
        }
        traverse(root.left,cursum,targetSum,res,cur);
        traverse(root.right,cursum,targetSum,res,cur);
        cur.remove(cur.size()-1);
    }
}
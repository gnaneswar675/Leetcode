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
    public List<List<Integer>> pathSum(TreeNode root, int targetsum) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
        dfs(root,targetsum,0,res,cur);
        return res;
    }
    public void dfs(TreeNode root,int target,int cursum,List<List<Integer>> res,List<Integer> cur){
        if(root==null)return;
        cursum+=root.val;
        cur.add(root.val);
        if(root.left==null && root.right==null && cursum==target){
            res.add(new ArrayList<>(cur));
        }
        dfs(root.left,target,cursum,res,cur);
        dfs(root.right,target,cursum,res,cur);
        cur.remove(cur.size()-1);
    }
}